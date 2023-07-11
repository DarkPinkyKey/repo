package prueba;

public class Excercice_diapo163 {

	public static void main(String[] args) {
		//Byte//   
		byte number = 100;
	        System.out.println("Número inicial: " + number);
	        
	        // Desbordamiento de 5 posiciones
	        for (int i = 0; i < 5; i++) {
	            number++;
	        }
	        
	        System.out.println("Número desbordado: " + number);
	        //Short//
	        short num = 0;
	        System.out.println("Número inicial: " + num);
	        
	        // Desbordamiento de 25 posiciones
	        for (int i = 0; i < 25; i++) {
	            num++;
	        }
	        
	        System.out.println("Número desbordado: " + num);
	        
	        //Int//
	        int num01 = 10;
	        System.out.println("Número inicial: " + num01);
	        
	        // Desbordamiento de 10,000 posiciones
	        for (int i = 0; i < 10_000; i++) {
	            num01++;
	        }
	        
	        System.out.println("Número desbordado: " + num01);
	        
	        //Long//
	        long num02 = 1_000_000_000L;
	        System.out.println("Número inicial: " + num02);
	        
	        // Desbordamiento de 20,000 posiciones
	        for (int i = 0; i < 20_000; i++) {
	            num02++;
	        }
	        
	        System.out.println("Número desbordado: " + num02);

	}
}
