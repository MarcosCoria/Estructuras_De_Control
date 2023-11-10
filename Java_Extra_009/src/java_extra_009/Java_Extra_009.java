/* Ejercicio_09: Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3. */
package java_extra_009;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_009 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número, mayor a 1: ");
        int num1= leer.nextInt();
        while (num1<2) {
            System.out.println("Error. Ingrese el primer número, mayor a 1: ");
            num1= leer.nextInt();
        }
        System.out.println("Ingrese el segundo número, mayor a 1: ");
        int num2= leer.nextInt();
        while (num2<2) {
            System.out.println("Error. Ingrese el segundo número, mayor a 1: ");
            num2= leer.nextInt();
        }
        int cont=0;
        while (num1>=num2){
            num1= num1-num2;
            cont++;
        }
        System.out.println("El residuo es: " + num1);
        System.out.println("El cociente es: " + cont);
    }   
}
