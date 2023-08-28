package prueba;

import java.util.Scanner;

public class Excercice_diapo240_parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            System.out.println(i + " Iteración");
            if (i == 5) {
                System.out.println("No imprimo mensaje");
            }
            i++;
        }
        sc.close();
    }
}
