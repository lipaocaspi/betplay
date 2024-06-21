package com.paola.betplay.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public int verifyInt(String message) {
         while (true) {
            try {
                System.out.println("---");
                System.out.println(message);
                System.out.println("---");
                Scanner sc = new Scanner(System.in);
                int valor = sc.nextInt();
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.println("***");
                    System.out.println("Ingrese un valor válido");
                    System.out.println("***");
                }
            } catch (InputMismatchException e) {
                System.out.println("***");
                System.out.println("Tipo de dato incorrecto");
                System.out.println("***");
            }
        }
    }

    @SuppressWarnings("resource")
    public String verifyString(String message) {
        while (true) {
            System.out.println("---");
            System.out.println(message);
            System.out.println("---");
            Scanner sc = new Scanner(System.in);
            String valor = sc.nextLine();
            if (valor == "") {
                System.out.println("***");
                System.out.println("No es posible registrar un texto vacio");
                System.out.println("***");
            } else {
                return valor;
            }
        }
    }
}