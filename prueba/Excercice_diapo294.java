package prueba;

public class Excercice_diapo294 {

	public static void main(String[] args) {
        // Tabla para el tipo de dato byte
        String byteTable = "\u001B[33m╭───────────────────────────────────╮\n" +
                           "│      Tipo de datos: byte         │\n" +
                           "│  Está formado por: 1 Bytes       │\n" +
                           "│ Un byte está formado por: 8 Bits │\n" +
                           "│   Su Rango va del: -128 a 127    │\n" +
                           "\u001B[33m╰───────────────────────────────────╯\u001B[0m\n";
        System.out.println(byteTable);

        // Tabla de resumen
        String resumenTable = "\u001B[35m╭─────────────────────────────────────────────────────────────────╮\n" +
                              "│   Rango byte desde: -128 hasta: 127                             │\n" +
                              "\u001B[35m├─────────────────────────────────────────────────────────────────┤\n" +
                              "│   Rango short desde: -32768 hasta: 32767                        │\n" +
                              "\u001B[35m├─────────────────────────────────────────────────────────────────┤\n" +
                              "│   Rango int desde: -2147483648 hasta: 2147483647                │\n" +
                              "\u001B[35m├─────────────────────────────────────────────────────────────────┤\n" +
                              "│   Rango long desde: -9223372036854775808 hasta: 9223372036854775807 │\n" +
                              "\u001B[35m├─────────────────────────────────────────────────────────────────┤\n" +
                              "│   Rango float desde: 1.4E-45 hasta: 3.4028235E38                │\n" +
                              "\u001B[35m├─────────────────────────────────────────────────────────────────┤\n" +
                              "│   Rango double desde: 4.9E-324 hasta: 1.7976931348623157E308    │\n" +
                              "\u001B[35m╰─────────────────────────────────────────────────────────────────╯\u001B[0m\n";
        System.out.println(resumenTable);
    }
}
