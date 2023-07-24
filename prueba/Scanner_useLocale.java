package prueba;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Scanner_useLocale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un valor booleano (true/false): ");
            boolean booleanValue = scanner.nextBoolean();

            System.out.print("Introduce un número entero: ");
            int intValue = scanner.nextInt();

            System.out.print("Introduce un número de coma flotante: ");
            float floatValue = scanner.nextFloat();

            System.out.print("Introduce un número double: ");
            double doubleValue = scanner.nextDouble();

            scanner.useLocale(Locale.US); // Permitir utilizar punto como separador decimal
            System.out.print("Introduce un número real (con decimales): ");
            double realValue = scanner.nextDouble();

            System.out.print("Introduce un carácter: ");
            char charValue = scanner.next().charAt(0);

            System.out.print("Introduce una cadena de texto: ");
            String stringValue = scanner.next();

            System.out.println("\nValores leídos:");
            System.out.println("Booleano: " + booleanValue);
            System.out.println("Entero: " + intValue);
            System.out.println("Coma flotante: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Real: " + realValue);
            System.out.println("Carácter: " + charValue);
            System.out.println("Cadena de texto: " + stringValue);
        } catch (InputMismatchException e) {
            System.err.println("Error: Los datos introducidos no son válidos.");
        } catch (Exception e) {
            System.err.println("Error desconocido: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

