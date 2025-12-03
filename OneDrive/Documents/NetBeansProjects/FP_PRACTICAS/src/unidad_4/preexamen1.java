package unidad_4;

import java.util.Scanner;

public class preexamen1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre1, nombre2, nombre3, nombre4;
        int edad1, edad2, edad3, edad4;
        int mayor;

        System.out.print("Nombre 1: ");
        nombre1 = leer.nextLine();
        System.out.print("Edad 1: ");
        edad1 = leer.nextInt();
        leer.nextLine();

        System.out.print("Nombre 2: ");
        nombre2 = leer.nextLine();
        System.out.print("Edad 2: ");
        edad2 = leer.nextInt();
        leer.nextLine();

        System.out.print("Nombre 3: ");
        nombre3 = leer.nextLine();
        System.out.print("Edad 3: ");
        edad3 = leer.nextInt();
        leer.nextLine();

        System.out.print("Nombre 4: ");
        nombre4 = leer.nextLine();
        System.out.print("Edad 4: ");
        edad4 = leer.nextInt();

        // Encontrar la mayor edad
        mayor = edad1;

        if (edad2 > mayor) {
            mayor = edad2;
        }
        if (edad3 > mayor) {
            mayor = edad3;
        }
        if (edad4 > mayor) {
            mayor = edad4;
        }

        // Mostrar resultados
        System.out.println("\nPersonas con " + mayor + " años:");

        if (edad1 == mayor) {
            System.out.println(nombre1);
        }
        if (edad2 == mayor) {
            System.out.println(nombre2);
        }
        if (edad3 == mayor) {
            System.out.println(nombre3);
        }
        if (edad4 == mayor) {
            System.out.println(nombre4);
        }
    }
}