
package unidad_4;

import java.util.Scanner;

public class preexamen2 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int a1, a2, a3, a4;

        System.out.print("Ingresa el año 1: ");
        a1 = leer.nextInt();

        System.out.print("Ingresa el año 2: ");
        a2 = leer.nextInt();

        System.out.print("Ingresa el año 3: ");
        a3 = leer.nextInt();

        System.out.print("Ingresa el año 4: ");
        a4 = leer.nextInt();

        // Año 1
        if ((a1 % 4 == 0 && a1 % 100 != 0) || (a1 % 400 == 0)) {
            System.out.println(29);
        } else {
            System.out.println(28);
        }

        // Año 2
        if ((a2 % 4 == 0 && a2 % 100 != 0) || (a2 % 400 == 0)) {
            System.out.println(29);
        } else {
            System.out.println(28);
        }

        // Año 3
        if ((a3 % 4 == 0 && a3 % 100 != 0) || (a3 % 400 == 0)) {
            System.out.println(29);
        } else {
            System.out.println(28);
        }

        // Año 4
        if ((a4 % 4 == 0 && a4 % 100 != 0) || (a4 % 400 == 0)) {
            System.out.println(29);
        } else {
            System.out.println(28);
        }
    }
}