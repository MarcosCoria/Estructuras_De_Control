/* Ejercicio_05: Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio. */
package java_extra_005;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_005 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("SOCIOS:\nTIPO 'A'\nTIPO 'B'\nTIPO 'C'\nSeleccione una opción: ");
        String opt = leer.next();
        while (!opt.equalsIgnoreCase("A") && !opt.equalsIgnoreCase("B") && !opt.equalsIgnoreCase("C")) {
            System.out.println("Error. Intente nuevamente.\n\nSOCIOS:\nTIPO 'A'\nTIPO 'B'\nTIPO 'C'\nSeleccione una opción: ");
            opt = leer.next();
        }
        float tratamiento;
        double descuento;
        System.out.println("Ingrese valor del tratamiento: ");
        switch (opt) {
            case "A":
            case "a":
                tratamiento = leer.nextFloat();
                descuento = tratamiento * 0.5;
                System.out.println("Valor con descuento, socio tipo A: " + descuento);
                break;
            case "B":
            case "b":
                tratamiento = leer.nextFloat();
                descuento = tratamiento -(tratamiento * 0.35);
                System.out.println("Valor con descuento, socio tipo B: " + descuento);
                break;
            case "C":
            case "c":
                tratamiento= leer.nextFloat();
                System.out.println("Valor del tratamiento, socio tipo C: " + tratamiento);
                break;
            default:
                throw new AssertionError();
        }
    }
}
