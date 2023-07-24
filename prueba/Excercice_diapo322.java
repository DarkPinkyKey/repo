package prueba;

public class Excercice_diapo322 {

    public static void main(String[] args) {
        // Declaración de variables e inicialización
        byte myByte = 0;
        short myShort = 0;
        int myInt = 0;
        Long myLong = 0L;

        // Obtener la clase a la que pertenecen las variables
        System.out.println("Clase de myByte: " + ((Object) myByte).getClass().getName());
        System.out.println("Clase de myShort: " + ((Object) myShort).getClass().getName());
        System.out.println("Clase de myInt: " + ((Object) myInt).getClass().getName());
        System.out.println("Clase de myLong: " + ((Object) myLong).getClass().getName());
    }

}
