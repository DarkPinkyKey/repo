package prueba;

import java.util.Scanner;

public class ScannerInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un valor booleano (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.print("Introduce un número entero: ");
        int intValue = scanner.nextInt();

        System.out.print("Introduce un número de coma flotante: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Introduce un número double: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Introduce un carácter: ");
        char charValue = scanner.next().charAt(0);

        System.out.print("Introduce una cadena de texto: ");
        String stringValue = scanner.next();

        System.out.println("\nValores leídos:");
        System.out.println("Booleano: " + booleanValue);
        System.out.println("Entero: " + intValue);
        System.out.println("Coma flotante: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Carácter: " + charValue);
        System.out.println("Cadena de texto: " + stringValue);

        scanner.close();
    }
}
