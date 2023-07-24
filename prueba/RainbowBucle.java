package prueba;

import java.util.Random;

public class RainbowBucle {
    public static void main(String[] args) {
        String[] colors = {
            "\u001B[31m", // Rojo
            "\u001B[32m", // Verde
            "\u001B[33m", // Amarillo
            "\u001B[34m", // Azul
            "\u001B[35m", // Magenta
            "\u001B[36m", // Cian
            "\u001B[91m", // Rojo claro
            "\u001B[92m", // Verde claro
            "\u001B[93m", // Amarillo claro
            "\u001B[94m", // Azul claro
            "\u001B[95m", // Magenta claro
            "\u001B[96m"  // Cian claro
        };

        String[] bgColors = {
            "\u001B[40m", // Negro
            "\u001B[41m", // Rojo
            "\u001B[42m", // Verde
            "\u001B[43m", // Amarillo
            "\u001B[44m", // Azul
            "\u001B[45m", // Magenta
            "\u001B[46m", // Cian
            "\u001B[100m", // Negro claro
            "\u001B[101m", // Rojo claro
            "\u001B[102m", // Verde claro
            "\u001B[103m", // Amarillo claro
            "\u001B[104m", // Azul claro
            "\u001B[105m"  // Magenta claro
        };

        String[] formats = {
            "\u001B[0m", // Formato normal
            "\u001B[1m", // Negrita
            "\u001B[3m", // Cursiva
            "\u001B[4m"  // Subrayado
        };

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String randomColor = colors[random.nextInt(colors.length)];
            String randomBgColor = bgColors[random.nextInt(bgColors.length)];
            String randomFormat = formats[random.nextInt(formats.length)];
            String text = "Texto de ejemplo " + (i + 1);

            System.out.print(randomColor + randomBgColor + randomFormat + text + "\u001B[0m ");
        }
    }
}

