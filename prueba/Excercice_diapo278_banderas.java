package prueba;

public class Excercice_diapo278_banderas {

    // Constantes para colores de escape ANSI
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";

    public static void main(String[] args) {
        System.out.println("Ucrania:");
        System.out.println(RESET + YELLOW + "  ***    ");
        System.out.println(RESET + YELLOW + " ██████  ");
        System.out.println(RESET + YELLOW + "  ███    ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println();

        System.out.println("Grecia:");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + " ██████  ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + WHITE + "  ███    ");
        System.out.println();

        System.out.println("Francia:");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + "  ███    ");
        System.out.println(RESET + BLUE + " ██████  ");
        System.out.println(RESET + WHITE + " ██████  ");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println();

        System.out.println("España:");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println(RESET + YELLOW + "  ███    ");
        System.out.println(RESET + YELLOW + "  ███    ");
        System.out.println(RESET + YELLOW + "  ███    ");
        System.out.println();

        System.out.println("Cataluña:");
        System.out.println(RESET + RED + "  ███    ");
        System.out.println(RESET + YELLOW + " ████    ");
        System.out.println(RESET + BLUE + " ████    ");
        System.out.println(RESET + YELLOW + "  ███    ");
        System.out.println(RESET + RED + "  ███    ");
        System.out.println(RESET + RED + "  ███    ");
        System.out.println();

        System.out.println("Alemania:");
        System.out.println(RESET + BLACK + "  ███    ");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println(RESET + YELLOW + "  ███    ");
        System.out.println(RESET + RED + " ██████  ");
        System.out.println(RESET + BLACK + "  ███    ");
        System.out.println(RESET + BLACK + "  ███    ");
    }
}

