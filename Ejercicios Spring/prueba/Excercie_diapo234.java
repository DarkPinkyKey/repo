package prueba;

public class Excercie_diapo234 {

	public static void main(String[] args) {
		  // Generar un número aleatorio (0 o 1)
        int numeroAleatorio = (int) (Math.random() * 2);

        // Etapa 1: if unidireccional
        if (numeroAleatorio == 0) {
            boolean valorBooleano = true;
            System.out.println("El valor booleano es: " + valorBooleano);
            System.out.println("El color es: rojo");
        }
        if (numeroAleatorio == 1) {
            boolean valorBooleano = false;
            System.out.println("El valor booleano es: " + valorBooleano);
            System.out.println("El color es: negro");
        }

        // Etapa 2: if-else bidireccional
        if (numeroAleatorio == 0) {
            boolean valorBooleano = true;
            System.out.println("El valor booleano es: " + valorBooleano);
            System.out.println("El color es: rojo");
        } else {
            boolean valorBooleano = false;
            System.out.println("El valor booleano es: " + valorBooleano);
            System.out.println("El color es: negro");
        }

        // Etapa 3: operador ternario
        boolean valorBooleano = (numeroAleatorio == 0) ? true : false;
        String color = (numeroAleatorio == 0) ? "rojo" : "negro";
        System.out.println("El valor booleano es: " + valorBooleano);
        System.out.println("El color es: " + color);

	}

}
