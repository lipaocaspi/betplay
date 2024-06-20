package com.paola.betplay.Country.adapters.in;

import java.util.Optional;
import java.util.Scanner;

import com.paola.betplay.Country.application.CountryService;
import com.paola.betplay.Country.domain.models.Country;

public class CountryConsoleAdapter {
    private CountryService countryService;

    public CountryConsoleAdapter(CountryService countryService) {
        this.countryService = countryService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear País");
            System.out.println("2. Actualizar País");
            System.out.println("3. Buscar País por ID");
            System.out.println("4. Eliminar País");
            System.out.println("5. Listar todos Paises");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nobre del pais: ");
                    String createName = scanner.nextLine();

                    Country newCountry = new Country(createName);
                    countryService.createCountry(newCountry);
                    break;

                case 2:
                    System.out.print("Ingrese  ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String updateName = scanner.nextLine();

                    Country updatedCountry = new Country(updateId, updateName);
                    countryService.updateCountry(updatedCountry);
                    break;

                case 3:
                    System.out.print("Ingrese el Id del pais a buscar: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();

                    Optional<Country> pais = countryService.getCountryById(findId);
                    pais.ifPresentOrElse(
                        p -> System.out.println("ID: " + p.getIdCountry() + ", Nombre: " + p.getNameCountry()),
                        () -> System.out.println("Country no encontrado")
                    );
                    break;

                case 4:
                    System.out.print("Ingrese el Id del pais a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    countryService.deleteCountry(deleteId);
                    break;

                case 5:
                    countryService.getAllCountries().forEach(p -> {
                        System.out.println("ID: " + p.getIdCountry() + ", Nombre: " + p.getNameCountry());
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