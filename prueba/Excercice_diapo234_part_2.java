package prueba;

public class Excercice_diapo234_part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   // Temperatura proporcionada
        double temperatura = 25.5;

        // Usando if unidireccionales sin else
        if (temperatura <= 0) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Muy frío");
        }
        if (temperatura > 0 && temperatura <= 10) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Frío");
        }
        if (temperatura > 10 && temperatura <= 20) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Templado");
        }
        if (temperatura > 20 && temperatura <= 30) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Cálido");
        }
        if (temperatura > 30) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Muy caliente");
        }

        // Usando if-elseif-else
        if (temperatura <= 0) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Muy frío");
        } else if (temperatura <= 10) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Frío");
        } else if (temperatura <= 20) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Templado");
        } else if (temperatura <= 30) {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Cálido");
        } else {
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Categoría: Muy caliente");
        }


	}

}
