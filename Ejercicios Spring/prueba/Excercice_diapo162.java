package prueba;

public class Excercice_diapo162 {

	public static void main(String[] args) {
		// Lógico
		
		/* Boolean*/
		boolean x;
        x = false; // Declaramos el valor false //
        System.out.println("La variable x es: " + x); // Indicamos el print que en este caso saldria falso//
    
        x = true; // Declaramos el valor true //
        System.out.println("La variable x es: " + x); // Indicamos el print que saldria true //
		// Carácter
		
        /*Char*/
        char letra1, letra2;
        
        letra1 = 'a'; // Declaramos el primer caracter //
        letra2 = 'b'; // Declaramos el segundo caracter //
 
        System.out.print("La primera letra es : "); // Indicamos que muestre la primera letra //
        System.out.println(letra1);
 
        System.out.print("La segunda letra es : "); // Indicamos que muestre la segunda letra //
        System.out.println(letra2);
        
		// Número entero
		
        /*Byte*/
        byte numero = 125; // En byte solo podemos almacenar valores del -128 a 127 //
        System.out.println(numero);
        
        /*Short*/
        short numero_short = -32000; // En short solo podemos almacenar valores entre -32768 al 32767 // 
        System.out.println(numero_short);
        
        /*Int*/
        int numero_int = 248547145; //En int solo podemos almacenar valores entre -2 147.483.648 al  2 147.483.647 //
        System.out.println(numero_int);
        
        /*Long*/
        long numero01 = 4235515464561074716L; // En long solo podemos almacenar valores entre 9 223 372 036 854 775 808 añadiendo una "L" al final//
        System.out.println(numero01);
	
		// Número real
        
        /*Float*/
        float num01 = 1.5f; //la F al final es importante, indica que es un float. Sirve para almacenar numeros con punto flotante.//
        System.out.println("Valor de número: " + num01);
        
        /*Double*/
		double num = 1425572789301254.1234; // Double es el hermano mayor de los datos primitivos, sirve para trabajar con numeros mayores.//
		System.out.println(num);
	}

}
