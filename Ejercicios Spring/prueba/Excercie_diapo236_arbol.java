package prueba;

public class Excercie_diapo236_arbol {

	public static void main(String[] args) {
		 int altura = 9; // Altura del árbol
	        for (int i = 1; i <= altura; i++) {
	            for (int j = altura - i; j >= 1; j--) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= i * 2 - 1; k++) {
	                System.out.print("*");
	            }

	            System.out.println(); 
	        }
	         // Imprimir el tronco del árbol
	            for (int i = 1; i <= 3; i++) {
	                for (int j = 2; j <= altura - 1; j++) {
	                    System.out.print(" ");
	                }
	                System.out.println("***");
	        }    
	}
}
