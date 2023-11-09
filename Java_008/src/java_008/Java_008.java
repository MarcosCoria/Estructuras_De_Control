/* 

Ejercicio_08: Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

*/
package java_008;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_008 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==0 || i==3 || j==0 || j==3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(""); // Separar renglones
        }
    }  
}
