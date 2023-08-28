package prueba;

public class Excercice_diapo379 {
    public static void main(String[] args) {
        // Ejercicio 1: Recorre el siguiente array de forma recursiva
        String[] technologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SOL", "Java"};
        printArrayRecursive(technologies, 0);
        System.out.println();

        // Ejercicio 2: Recorre el array anterior hasta llegar a "HIM"
        printArrayUntilHIM(technologies, 0);
        System.out.println();

        // Ejercicio 3: Fibonacci de forma recursiva hasta que un número pasado por parámetro dentro de la función recursiva supere el siguiente número recursivo
        int limit = 50; // Límite para la serie Fibonacci
        int a = 0;
        int b = 1;
        fibonacciRecursive(a, b, limit);
        System.out.println();

        // Ejercicio 4: Invierte la palabra "supercalifragilisticoespialidoso" mediante una función recursiva
        String word = "supercalifragilisticoespialidoso";
        String reversed = reverseString(word);
        System.out.println("Original: " + word);
        System.out.println("Invertida: " + reversed);

        // Ejercicio 5: Suma los números pasados por parámetros de forma recursiva
        int result = sumNumbersRecursive(1, 2, 3, 4, 5);
        System.out.println("\nSuma: " + result);
    }

    // Ejercicio 1
    public static void printArrayRecursive(String[] arr, int index) {
        if (index >= arr.length) {
            return;
        }

        System.out.println(arr[index]);
        printArrayRecursive(arr, index + 1);
    }

    // Ejercicio 2
    public static void printArrayUntilHIM(String[] arr, int index) {
        if (index >= arr.length || arr[index].equals("HIM")) {
            return;
        }

        System.out.println(arr[index]);
        printArrayUntilHIM(arr, index + 1);
    }

    // Ejercicio 3
    public static void fibonacciRecursive(int a, int b, int limit) {
        if (a > limit) {
            return;
        }

        System.out.print(a + " ");
        fibonacciRecursive(b, a + b, limit);
    }

    // Ejercicio 4
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Ejercicio 5
    public static int sumNumbersRecursive(int... numbers) {
        return sumNumbersRecursiveHelper(numbers, 0, 0);
    }

    public static int sumNumbersRecursiveHelper(int[] numbers, int index, int sum) {
        if (index >= numbers.length) {
            return sum;
        }

        return sumNumbersRecursiveHelper(numbers, index + 1, sum + numbers[index]);
    }
}
