package prueba;

public class Main_1 {
    public static void main(String[] args) {
        if (args.length >= 2 && args[0].equals("Federico") && args[1].equals("García Lorca")) {
            Lorca.recitarPoema();
        } else {
            NotAuthorized.mostrarMensaje();
        }
    }
}

class Lorca {
    public static void recitarPoema() {
        System.out.println("Poema de Federico García Lorca:");
        System.out.println("...");
        // Aquí iría el poema completo, puedes agregar uno de tus poemas favoritos de Lorca.
    }
}

class NotAuthorized {
    public static void mostrarMensaje() {
        System.out.println("Parámetros incorrectos. Se esperaba \"Federico García Lorca\".");
    }
}
