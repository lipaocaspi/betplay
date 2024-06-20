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
        int updateId;
        int deleteId;
        Optional<Country> foundCountry;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear País");
            System.out.println("2. Actualizar País");
            System.out.println("3. Buscar País por ID");
            System.out.println("4. Eliminar País");
            System.out.println("5. Listar todos Paises");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre del pais: ");
                    String createName = scanner.nextLine();

                    Country newCountry = new Country(createName);
                    countryService.createCountry(newCountry);
                    break;

                case 2:
                    do {
                        System.out.print("Ingrese ID a actualizar: ");
                        updateId = scanner.nextInt();
                        foundCountry = countryService.getCountryById(updateId);
                        foundCountry.ifPresentOrElse(
                            c -> System.out.println("ID: " + c.getIdCountry() + ", Nombre: " + c.getNameCountry()),
                            () -> System.out.println("Pais no encontrado")
                        );
                    } while (!foundCountry.isPresent());
                    
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String updateName = scanner.nextLine();

                    Country updatedCountry = new Country(updateId, updateName);
                    countryService.updateCountry(updatedCountry);
                    break;

                case 3:
                    System.out.print("Ingrese el ID del pais a buscar: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();

                    Optional<Country> country = countryService.getCountryById(findId);
                    country.ifPresentOrElse(
                        c -> System.out.println("ID: " + c.getIdCountry() + ", Nombre: " + c.getNameCountry()),
                        () -> System.out.println("Pais no encontrado")
                    );
                    break;

                case 4:
                    do {
                        System.out.print("Ingrese el ID del pais a borrar: ");
                        deleteId = scanner.nextInt();
                        foundCountry = countryService.getCountryById(deleteId);
                        if (foundCountry.isPresent()) {
                            countryService.deleteCountry(deleteId);
                        } else {
                            System.out.println("Pais no encontrado");
                        }
                    } while (!foundCountry.isPresent());

                    scanner.nextLine();
                    break;

                case 5:
                    countryService.getAllCountries().forEach(c -> {
                        System.out.println("ID: " + c.getIdCountry() + ", Nombre: " + c.getNameCountry());
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