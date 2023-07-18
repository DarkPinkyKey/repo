package prueba;

public class Excercice_diapo238_parte2 {

	public static void main(String[] args) {
		// Ejercicio 3 //
		System.out.println("Saludos");
		System.out.println("Holaaaa");
		  // Bucle for
		int saludosBucle = 5; // Numero de Saludos //
        System.out.println("\nBucle for:");
        for (int i = 0; i < saludosBucle; i++) {
            System.out.println("Hola");
        }

        // Bucle while
        System.out.println("\nBucle while:");
        int saludosWhile = 2; // Numero de Saludos //
        int contadorWhile = 0;
        while (contadorWhile < saludosWhile) {
            System.out.println("Hola");
            contadorWhile++;
        }

        // Bucle do-while
        System.out.println("\nBucle do-while:");
        int saludos3Bucle = 1; // Numero de Saludos //
        int contadorDoWhile = 0;
        do {
            System.out.println("Hola");
            contadorDoWhile++;
        } while (contadorDoWhile < saludos3Bucle);

	}
}
