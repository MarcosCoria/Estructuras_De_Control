/* Ejercicio_06: Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú: El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú. 
MENÚ:
1-Sumar
2-Restar
3-Multiplicar
4-Dividir
5-Salir
*/
package java_006;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_006 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número positivo: ");
        int num1= leer.nextInt();
        while (num1<=0) {
            System.out.println("Error. Ingrese el primer número positivo: ");
            num1= leer.nextInt();
        }
        System.out.println("Ingrese el segundo número positivo");
        int num2= leer.nextInt();
        while (num2<=0) {
            System.out.println("Error. Ingrese el segundo número positivo: ");
            num2= leer.nextInt();
        }
        boolean var=false;
        while (var==false) {
            System.out.println("MENÚ\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Salir");
            int opt= leer.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1*num2));
                    break;
                case 4:
                    if (num2==0) {
                        System.out.println("Error. No se puede dividir por 0");
                    } else {
                        float a= num1;
                        float b= num2;
                        System.out.println("La división es: " + (a/b));
                    }
                    break;
                case 5:
                    System.out.println("Finalizando. Gracias por utilizar el programa");
                    var=true;
                    break;
                default:
                    System.out.println("Error. Ingrese otra opción");
            }
        }
    }   
}
