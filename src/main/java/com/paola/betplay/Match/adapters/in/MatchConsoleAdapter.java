package com.paola.betplay.Match.adapters.in;

import java.util.Optional;
import java.util.Scanner;

import com.paola.betplay.Match.application.MatchService;
import com.paola.betplay.Match.domain.models.Match;

public class MatchConsoleAdapter {
    private MatchService matchService;

    public MatchConsoleAdapter(MatchService matchService) {
        this.matchService = matchService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Partido");
            System.out.println("2. Actualizar Partido");
            System.out.println("3. Buscar Partido por ID");
            System.out.println("4. Eliminar Partido");
            System.out.println("5. Listar todos Partidos");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese la fecha del partido: ");
                    String createDate = scanner.nextLine();

                    Match newMatch = new Match(createDate);
                    matchService.createMatch(newMatch);
                    break;

                case 2:
                    System.out.print("Ingrese  ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la nueva fecha: ");
                    String updateDate = scanner.nextLine();

                    Match updatedMatch = new Match(updateId, updateDate);
                    matchService.updateMatch(updatedMatch);
                    break;

                case 3:
                    System.out.print("Ingrese el Id del partido a buscar: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();

                    Optional<Match> match = matchService.getMatchById(findId);
                    match.ifPresentOrElse(
                        m -> System.out.println("ID: " + m.getIdMatch() + ", Nombre: " + m.getDateMatch()),
                        () -> System.out.println("Partido no encontrado")
                    );
                    break;

                case 4:
                    System.out.print("Ingrese el Id del partido a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    matchService.deleteMatch(deleteId);
                    break;

                case 5:
                    matchService.getAllMatches().forEach(m -> {
                        System.out.println("ID: " + m.getIdMatch() + ", Nombre: " + m.getDateMatch());
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