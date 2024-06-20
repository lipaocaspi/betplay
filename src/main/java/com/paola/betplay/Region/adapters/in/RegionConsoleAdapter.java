package com.paola.betplay.Region.adapters.in;

import java.util.Optional;
import java.util.Scanner;

import com.paola.betplay.Region.application.RegionService;
import com.paola.betplay.Region.domain.models.Region;

public class RegionConsoleAdapter {
    private RegionService regionService;

    public RegionConsoleAdapter(RegionService regionService) {
        this.regionService = regionService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Region");
            System.out.println("2. Actualizar Region");
            System.out.println("3. Buscar Region por ID");
            System.out.println("4. Eliminar Region");
            System.out.println("5. Listar todas Regiones");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre de la region: ");
                    String createName = scanner.nextLine();
                    // VALIDACION EXISTENCIA DEL PAIS
                    int idCountry;
                    int idF;
                    do {
                        System.out.println("Ingrese el Id del pais: ");
                        idCountry = scanner.nextInt();
                        idF = regionService.getCountryById(idCountry);
                    } while (idF == -1);
        
                    Region newRegion = new Region(createName, idCountry);
                    regionService.createRegion(newRegion);
                    break;

                case 2:
                    System.out.print("Ingrese  ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String updateName = scanner.nextLine();

                    Region updatedRegion = new Region(updateId, updateName);
                    regionService.updateRegion(updatedRegion);
                    break;

                case 3:
                    System.out.print("Ingrese el Id de la region a buscar: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();

                    Optional<Region> region = regionService.getRegionById(findId);
                    region.ifPresentOrElse(
                        r -> System.out.println("ID: " + r.getIdRegion() + ", Nombre: " + r.getNameRegion()),
                        () -> System.out.println("Region no encontrada")
                    );
                    break;

                case 4:
                    System.out.print("Ingrese el Id de la region a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    regionService.deleteRegion(deleteId);
                    break;

                case 5:
                    regionService.getAllRegions().forEach(r -> {
                        System.out.println("ID: " + r.getIdRegion() + ", Nombre: " + r.getNameRegion());
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