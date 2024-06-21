package com.paola.betplay.console;

import com.paola.betplay.City.adapters.in.CityConsoleAdapter;
import com.paola.betplay.City.adapters.out.CityMySQLRepository;
import com.paola.betplay.City.application.CityService;
import com.paola.betplay.City.domain.models.City;
import com.paola.betplay.Country.adapters.in.CountryConsoleAdapter;
import com.paola.betplay.Country.adapters.out.CountryMySQLRepository;
import com.paola.betplay.Country.application.CountryService;
import com.paola.betplay.Country.domain.models.Country;
import com.paola.betplay.Region.adapters.in.RegionConsoleAdapter;
import com.paola.betplay.Region.adapters.out.RegionMySQLRepository;
import com.paola.betplay.Region.application.RegionService;
import com.paola.betplay.Region.domain.models.Region;

public class Menus {
    CountryMySQLRepository countryMySQLRepository = new CountryMySQLRepository("jdbc:mysql://localhost:3306/betplay", "root", "****************");
    CountryService countryService = new CountryService(countryMySQLRepository);
    CountryConsoleAdapter countryConsoleAdapter = new CountryConsoleAdapter(countryService);

    RegionMySQLRepository regionMySQLRepository = new RegionMySQLRepository("jdbc:mysql://localhost:3306/betplay", "root", "****************");
    RegionService regionService = new RegionService(regionMySQLRepository, countryMySQLRepository);
    RegionConsoleAdapter regionConsoleAdapter = new RegionConsoleAdapter(regionService);

    CityMySQLRepository cityMySQLRepository = new CityMySQLRepository("jdbc:mysql://localhost:3306/betplay", "root", "****************");
    CityService cityService = new CityService(cityMySQLRepository, regionMySQLRepository);
    CityConsoleAdapter cityConsoleAdapter = new CityConsoleAdapter(cityService);

    static String mainMenuList = """
        1. Registros Generales
        2. Registrar Equipo
        3. Registrar Jugador
        4. Registrar Cuerpo Técnico
        5. Registrar Cuerpo Médico
        6. Registrar Partido
        7. Reportes
        8. Salir
        """;

    static String generalMenuList = """
        *****************************
            REGISTROS GENERALES
        *****************************
        1. Registrar Pais
        2. Registrar Region
        3. Registrar Ciudad
        4. Registrar Rol
        5. Registrar Posición
        6. Salir
        """;

    static String coachingStaffMenuList = """
        *******************************
            REGISTRO CUERPO TÉCNICO
        *******************************
        1. Registrar técnico
        2. Registrar asistente técnico
        3. Registrar preparador físico
        4. Salir al menú principal
        """;

    static String medicalStaffMenuList = """
        *******************************
            REGISTRO CUERPO MÉDICO
        *******************************
        1. Registrar fisioterapeuta
        2. Registrar médico
        3. Salir al menú principal
        """;

    static String reportsMenuList = """
        *******************************
                    REPORTES
        *******************************
        1. Jugador con más goles anotados
        2. Jugador con más tarjetas rojas recibidas
        3. Jugador con más tarjetas amarillas recibidas
        4. Listar jugadores por equipo
        5. Tabla de posiciones del torneo
        6. Cuerpo técnico por equipo
        7. Salir al menú principal
        """;
    
    static String title = """
        ********************************
                LIGA BETPLAY
        ********************************
        """;

    public static String getMainMenuList() {
        return mainMenuList;
    }

    public static String getGeneralMenuList() {
        return generalMenuList;
    }

    public static String getCoachingStaffMenuList() {
        return coachingStaffMenuList;
    }

    public static String getMedicalStaffMenuList() {
        return medicalStaffMenuList;
    }

    public static String getReportsMenuList() {
        return reportsMenuList;
    }

    public static String getTitle() {
        return title;
    }

    public void showMainMenu() {
        Console console = new Console();
        int choice;
        do {
            System.out.println(getTitle());
            System.out.println(getMainMenuList());
            choice = console.verifyInt("Ingrese la opción: ");
            switch (choice) {
                case 1:
                    showGeneralMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    showCoachingStaffMenu();
                    break;
                case 5:
                    showMedicalStaffMenu();
                    break;
                case 6:
                    break;
                case 7:
                    showReportsMenu();
                    break;
                case 8:
                    System.out.println("****************************");
                    System.out.println("GRACIAS POR USAR EL SERVICIO");
                    System.out.println("****************************");
                    break;
                default:
                    System.out.println("***");
                    System.out.println("Ingrese una opción válida");
                    System.out.println("***");
                    break;
            }
        } while (choice != 8);
    }

    public void showGeneralMenu() {
        Console console = new Console();
        String createName;
        int idCountry;
        int idRegion;
        int idF;
        int choice;
        do {
            System.out.println(getGeneralMenuList());
            choice = console.verifyInt("Ingrese la opción: ");
            switch (choice) {
                case 1:
                    createName = console.verifyString("Ingrese el nombre del pais: ");
                    Country newCountry = new Country(createName);
                    countryService.createCountry(newCountry);
                    break;
                case 2:
                    createName = console.verifyString("Ingrese el nombre de la region: ");
                    do {
                        idCountry = console.verifyInt("Ingrese el ID del pais: ");
                        idF = regionService.getCountryById(idCountry);
                    } while (idF == -1);
                    Region newRegion = new Region(createName, idCountry);
                    regionService.createRegion(newRegion);
                    break;
                case 3:
                    createName = console.verifyString("Ingrese el nombre de la ciudad: ");
                    do {
                        idRegion = console.verifyInt("Ingrese el ID de la región: ");
                        idF = cityService.getRegionById(idRegion);
                    } while (idF == -1);
                    City newCity = new City(createName, idRegion);
                    cityService.createCity(newCity);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("***");
                    System.out.println("Ingrese una opción válida");
                    System.out.println("***");
                    break;
            }
        } while (choice != 6);
    }

    public void showCoachingStaffMenu() {
        Console console = new Console();
        int choice;
        do {
            System.out.println(getCoachingStaffMenuList());
            choice = console.verifyInt("Ingrese la opción: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("***");
                    System.out.println("Ingrese una opción válida");
                    System.out.println("***");
                    break;
            }
        } while (choice != 4);
    }

    public void showMedicalStaffMenu() {
        Console console = new Console();
        int choice;
        do {
            System.out.println(getMedicalStaffMenuList());
            choice = console.verifyInt("Ingrese la opción: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("***");
                    System.out.println("Ingrese una opción válida");
                    System.out.println("***");
                    break;
            }
        } while (choice != 3);
    }

    public void showReportsMenu() {
        Console console = new Console();
        int choice;
        do {
            System.out.println(getReportsMenuList());
            choice = console.verifyInt("Ingrese la opción: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("***");
                    System.out.println("Ingrese una opción válida");
                    System.out.println("***");
                    break;
            }
        } while (choice != 7);
    }
}