/* Ejercicio_07: Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals(). */
package java_007;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_007 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena de carácteres; ingrese '&&&&&' para finalizar: ");
        String frase= leer.nextLine();
        while (frase.equals("") || frase.equals(" ")) {
            System.out.println("Error. Ingrese una cadena de carácteres; ingrese '&&&&&' para finalizar: ");
            frase= leer.nextLine();
        }
        int cont1= 0;
        int cont2= 0;
        while (!frase.equals("&&&&&")) {
            System.out.println("Ingrese una cadena de carácteres; ingrese '&&&&&' para finalizar: ");
            frase= leer.nextLine();
            if (frase.substring(0,1).equals("X") && frase.substring(4, 5).equals("O")) {
                cont1++;
            } else {
                cont2++;
            }
        }
        System.out.println("La cantidad de palabras correctas ingresadas es: " + cont1);
        System.out.println("La cantidad de palabras incorrectas ingresadas es: " + cont2);
    }  
}
