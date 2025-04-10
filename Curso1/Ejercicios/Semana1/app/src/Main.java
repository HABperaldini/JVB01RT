import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio Nº 1
        // a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
        // b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenido al sistema”.
        String nombre = "Stefano";
        System.out.println("Hola " + nombre  +  ", bienvenido al sistema");

        //Ejercicio Nº 2
        // a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.
        // b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso.
        int numero = 1;
        double numDouble = 2.2;
        boolean bandera = true;
        String apellido = "Peraldini";

        System.out.println(numero);
        System.out.println(numDouble);
        System.out.println(bandera);
        System.out.println(apellido);

        // apellido = 2.2;

        //Ejercicio Nº 3 - Variables y Operadores
        //Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).
        //Pista: Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando la fórmula.
        double base = 2;
        double altura = 3;
        System.out.println("EL area del triandulo es: " + (base * altura) / 2 );

        // Ejercicio Nº 4 - Operaciones de Lectura
        // Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
        // Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
        Scanner scanner = new Scanner(System.in);
        int num1,  num2;
        System.out.println("Dame el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Dame el segundo numero:");
        num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));




    }
}