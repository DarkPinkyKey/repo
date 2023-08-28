package prueba;

public class Excercice_diapo278_banderas {

    public static void main(String[] args) {
        // Bandera de Ucrania
        System.out.print("\u001B[47m"); // Fondo blanco
        System.out.print("\u001B[34m"); // Texto azul
        for (int i = 1; i <= 4; i++) {
            System.out.println("*********");
        }
        System.out.print("\u001B[0m"); // Restaurar colores originales
        System.out.println();

        // Bandera de Grecia
        System.out.print("\u001B[47m"); // Fondo blanco
        System.out.print("\u001B[30m"); // Texto negro
        System.out.print("\u001B[34m"); // Texto azul
        System.out.print("*********\n");
        System.out.print("*********\n");
        System.out.print("*********\n");
        System.out.print("*********\n");
        System.out.print("\u001B[0m"); // Restaurar colores originales
    }
}
