package prueba;

public class Excercice_diapo238_parte3 {

	public static void main(String[] args) {
		  String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        StringBuilder letrasGuardadas = new StringBuilder();

	        // Mostrar letras en orden ascendente hasta el final del abecedario
	        System.out.println(letrasGuardadas.toString());
	        for (int i = 0; i < abecedario.length(); i++) {
	            String letra = String.valueOf(abecedario.charAt(i));
	            letrasGuardadas.append(letra);
	            System.out.println(letrasGuardadas.toString());
	        }
	}
}
