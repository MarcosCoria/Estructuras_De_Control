/* Ejercicio_08: Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break. */
package java_extra_008;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_008 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean var= false;
        int cont=0;
        do {
            System.out.println("Ingrese números mayores a 0 ó un múltiplo de 5 para finalizar: ");
            int num= leer.nextInt();
            if (num<=0) {
                System.out.print("Error. ");
            } else if (num%5==0) {
                cont++;
                var=true;
            } else {
                cont++;
            }
        } while (var==false);
        System.out.println("Cantidad de números correctos ingresados: " + cont);
    }  
}
