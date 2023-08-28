package prueba;

import java.util.Random;

public class Excercice_diapo260_ej3 {
    public static boolean esPar() {
        Random random = new Random();
        int numero = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
        System.out.println("Número generado: " + numero);

        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        boolean resultado = esPar();
        if (resultado) {
            System.out.println("Es par (true)");
        } else {
            System.out.println("Es impar (false)");
        }
    }
}
