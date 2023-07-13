package prueba;

public class Excercie_diapo199 {
    private static int numero = 0;

	public static void main(String[] args) {
		  incrementar();
	        incrementar();
	        decrementar();
	        System.out.println("El valor final de la variable 'numero' es: " + numero);
	    }

	    public static void incrementar() {
	        numero += 1;
	        System.out.println("El valor final de la variable 'numero' es: " + numero);    
	    }

	    public static void decrementar() {
	        numero -= 2;
	}

}
