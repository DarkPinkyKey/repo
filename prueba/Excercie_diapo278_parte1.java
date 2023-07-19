package prueba;

public class Excercie_diapo278_parte1 {
    // Colores de texto (ANSI escape codes)
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";

    // Colores de fondo (ANSI escape codes)
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_YELLOW = "\u001B[43m";

    // Tipos de texto
    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";

    public static void main(String[] args) {
        System.out.println(RED + "Texto en rojo");
        System.out.println(YELLOW + "Texto en amarillo");
        System.out.println(BG_RED + "Fondo rojo");
        System.out.println(BG_YELLOW + "Fondo amarillo");
        System.out.println(RESET + "Texto con formato normal");
        System.out.println(BOLD + "Texto en negrita");
        System.out.println(UNDERLINE + "Texto subrayado");
 
    }
}

