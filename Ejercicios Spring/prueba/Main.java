package prueba;

public class Main {

    public static void main(String[] args) {
        HolaMundo saludador = new HolaMundo();
        HastaNunqui despedida = new HastaNunqui();

        System.out.println(saludador.saludar());
        System.out.println(despedida.patada());
    }
}

class HolaMundo {
    public String saludar() {
        return "Hola Mundo";
    }
}

class HastaNunqui {
    public String patada() {
        return "¡Hasta Nunqui!";
    }
}

