package unidad_4;

import java.util.Scanner;

public class Practica_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num;
        System.out.println("dame un numero");
        num=leer.nextFloat();
        if (num==0) {System.out.println("es cero");
            
        } else { if (num>0) {System.out.println("es posityivo");
                
            } else {System.out.println("es negativo");
            }
        }
    }
 
}
