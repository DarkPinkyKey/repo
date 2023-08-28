package prueba;

public class Excercice_diapo235_parte_1 {

	public static void main(String[] args) {
	       
	        int numero = 9; //Introducimos el numero //

	        String numeroTexto;

	        switch (numero) {
	            case 1:
	                numeroTexto = "Uno";
	                break;
	            case 2:
	                numeroTexto = "Dos";
	                break;
	            case 3:
	                numeroTexto = "Tres";
	                break;
	            case 4:
	                numeroTexto = "Cuatro";
	                break;
	            case 5:
	                numeroTexto = "Cinco";
	                break;
	            case 6:
	                numeroTexto = "Seis";
	                break;
	            case 7:
	                numeroTexto = "Siete";
	                break;
	            case 8:
	                numeroTexto = "Ocho";
	                break;
	            case 9:
	                numeroTexto = "Nueve";
	                break;
	            default:
	                numeroTexto = "Número inválido";
	                break;
	        }

	        System.out.println("El numero " + numero + " en texto es: " + numeroTexto);
	}

}
