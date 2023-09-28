import java.util.Scanner;

/*
 * @author MAAJ
 * @Version 23/08/2023
 */

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario dos números
        System.out.print("Ingresa el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = scanner.nextDouble();

        // Realizar operaciones matemáticas
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double modulo = numero1 % numero2;

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        // Solicitar una cadena y un carácter
        scanner.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa un caracter: ");
        char caracter = scanner.next().charAt(0);

        // Mostrar la cadena y el carácter
        System.out.println("Cadena: " + cadena);
        System.out.println("Caracter: " + caracter);

        // Cerrar el scanner
        scanner.close();
    }
}
