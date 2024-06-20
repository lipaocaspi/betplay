package com.paola.betplay.City.adapters.in;

import java.util.Optional;
import java.util.Scanner;

import com.paola.betplay.City.application.CityService;
import com.paola.betplay.City.domain.models.City;

public class CityConsoleAdapter {
    private CityService cityService;

    public CityConsoleAdapter(CityService cityService) {
        this.cityService = cityService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Ciudad");
            System.out.println("2. Actualizar Ciudad");
            System.out.println("3. Buscar Ciudad por ID");
            System.out.println("4. Eliminar Ciudad");
            System.out.println("5. Listar todas Ciudades");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    String createName = scanner.nextLine();

                    City newCity = new City(createName);
                    cityService.createCity(newCity);
                    break;

                case 2:
                    System.out.print("Ingrese  ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String updateName = scanner.nextLine();

                    City updatedCity = new City(updateId, updateName);
                    cityService.updateCity(updatedCity);
                    break;

                case 3:
                    System.out.print("Ingrese el Id de la ciudad a buscar: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();

                    Optional<City> city = cityService.getCityById(findId);
                    city.ifPresentOrElse(
                        c -> System.out.println("ID: " + c.getIdCity() + ", Nombre: " + c.getNameCity()),
                        () -> System.out.println("Ciudad no encontrada")
                    );
                    break;

                case 4:
                    System.out.print("Ingrese el Id de la ciudad a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    cityService.deleteCity(deleteId);
                    break;

                case 5:
                    cityService.getAllCities().forEach(c -> {
                        System.out.println("ID: " + c.getIdCity() + ", Nombre: " + c.getNameCity());
                    });
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}