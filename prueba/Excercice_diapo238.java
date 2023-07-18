package prueba;

public class Excercice_diapo238 {

	public static void main(String[] args) {
		//Ejercicio 1 //
		for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
		//Ejercicio 2//
		 int[] numeros = { 9, 4, 12, 7, 18, 5, 21, 15 }; // Ejemplos de numeros //

	        // Bucle for
	        System.out.println("Divisibles por 3 (Bucle for):");
	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] % 3 == 0) {
	                System.out.println(numeros[i]);
	            }
	        }

	        // Bucle while
	        System.out.println("Divisibles por 3 (Bucle while):");
	        int j = 0;
	        while (j < numeros.length) {
	            if (numeros[j] % 3 == 0) {
	                System.out.println(numeros[j]);
	            }
	            j++;
	        }
	        	
	}

}
