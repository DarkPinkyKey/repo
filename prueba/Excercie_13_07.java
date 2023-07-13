// Ejercicio diapo 168 //

/* Boolean*/
package prueba;

public class Excercie_13_07 {
	private static final boolean FALSE = false;
	private static final boolean TRUE = true;

	public static void main(String[] args) {
	boolean x;
	    x = FALSE; // Declaramos el valor false //
	    System.out.println("La variable x es: " + x); // Indicamos el print que en este caso saldria falso//

	    x = TRUE; // Declaramos el valor true //
	    System.o                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             t6ut.println("La variable x es: " + x);
	}

}
----------------------
/*Char*/
package prueba;

public class Excercie_13_07 {
private static final char LETRA1 = 'a';
private static final char LETRA2 = 'b';

public static void main(String[] args) {
	char letra1, letra2;

	letra1 = LETRA1; // Declaramos el primer caracter //
	letra2 = LETRA2; // Declaramos el segundo caracter //

	System.out.print("La primera letra es : "); // Indicamos que muestre la primera letra //
	System.out.println(letra1);

	System.out.print("La segunda letra es : "); // Indicamos que muestre la segunda letra //
	System.out.println(letra2);
}
}
------------------------
/*Byte*/
package prueba;

public class Excercie_13_07 {
	private static final byte BYTE = 125;

	public static void main(String[] args) {
		byte numero = BYTE; // En byte solo podemos almacenar valores del -128 a 127 //
        System.out.println(numero);

	}
}
-------------------------
/*Short*/
package prueba;

public class Excercie_13_07 {
	private static final short SHORT = -32000;
	
	public static void main(String[] args) {
		short numero_short = SHORT; // En short solo podemos almacenar valores entre -32768 al 32767 // 
		System.out.println(numero_short);
	}
}
--------------------------
/*Int*/
package prueba;

public class Excercie_13_07 {
	private static final int INT = 248547145;
	
	public static void main(String[] args) {
		int numero_int = INT; //En int solo podemos almacenar valores entre -2 147.483.648 al  2 147.483.647 //
		System.out.println(numero_int);
	}
}
--------------------------
/*Long*/
package prueba;

public class Excercie_13_07 {
	private static final long LONG = 4235515464561074716L;
	
	public static void main(String[] args) {
		long numero01 = LONG; // En long solo podemos almacenar valores entre 9 223 372 036 854 775 808 añadiendo una "L" al final//
		System.out.println(numero01);
	}
}

--------------------------
/*Float*/
package prueba;

public class Excercie_13_07 {
	private static final float FLOAT = 1.5f;
	
	public static void main(String[] args) {
		float num01 = FLOAT; //la F al final es importante, indica que es un float. Sirve para almacenar numeros con punto flotante.//
		System.out.println("Valor de número: " + num01);
	}
}
--------------------------
/*Double*/
package prueba;

public class Excercie_13_07 {
	private static final double DOUBLE = 1425572789301254.1234;
	
	public static void main(String[] args) {
		double num = DOUBLE; // Double es el hermano mayor de los datos primitivos, sirve para trabajar con numeros mayores.//
		System.out.println(num);
	}
}