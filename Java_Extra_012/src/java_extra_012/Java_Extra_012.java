/* Ejercicio_12: Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. */
package java_extra_012;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_012 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String var = ""; // Valor a mostrar
        String cad1;
        String cad2;
        String cad3;
        for (int i = 0; i < 10; i++) {
            String aux1 = String.valueOf(i);
            if (aux1.substring(0, 1).equals("3")) {
                aux1 = "E";
            }
            cad1 = aux1;
            for (int j = 0; j < 10; j++) {
                String aux2 = String.valueOf(j);
                if (aux2.substring(0, 1).equals("3")) {
                    aux2 = "E";
                }
                cad2 = aux2;
                for (int k = 0; k < 10; k++) {
                    String aux3 = String.valueOf(k);
                    if (aux3.substring(0, 1).equals("3")) {
                        aux3 = "E";
                    }
                    cad3 = aux3;
                    System.out.println(cad1 + cad2 + cad3);
                }
            }
        }
    }
}
