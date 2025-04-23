package dia2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercicio Nº 4 - Operaciones de Lectura
        // Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
        // Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Dame el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Dame el segundo numero:");
        num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        if (num2 != 0)
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        else
            System.out.println("No se puede dividir por 0");
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // ¿La multiplicación se ejecuta?

    }
}
