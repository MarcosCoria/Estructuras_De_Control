/* Ejercicio_04: Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano */
package java_extra_004;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_004 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10: ");
        int num= leer.nextInt();
        while (num<1 || num>10) {
            System.out.println("Error. Ingrese un número entre 1 y 10: ");
            num= leer.nextInt();
        }
        String romano= "";
        if (num<4) {
            for (int i = 0; i < num; i++) {
                romano= romano + "I";
            }
            System.out.println("El número ingresado es: " + romano);
        } else if(num<9){
            romano= "V";
            switch (num) {
                case 4:
                    System.out.println("El número ingresado es : IV");
                    break;
                case 5: case 6: case 7: case 8:
                    for (int i = 5; i < num; i++) {
                    romano= romano + "I";
                }
                    System.out.println("El número ingresado es: " + romano);
                    break;
                default:
                    throw new AssertionError();
            }
        } else if(num==9){
            System.out.println("El número ingresado es: IX");
        } else {
            System.out.println("El número ingresado es: X");
        }
    }   
}
