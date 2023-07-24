package prueba;

public class Excercice_diapo333 {

	public static void main(String[] args) {
		//1//
		double myDouble = 123.45;
        float myFloat = (float) myDouble;
        long myLong = (long) myFloat;
        int myInt = (int) myLong;
        short myShort = (short) myInt;
        byte myByte = (byte) myShort;

        System.out.println("Valor original: " + myDouble);
        System.out.println("Valor en float: " + myFloat);
        System.out.println("Valor en long: " + myLong);
        System.out.println("Valor en int: " + myInt);
        System.out.println("Valor en short: " + myShort);
        System.out.println("Valor en byte: " + myByte);
        
        System.out.println("\n");
        //2//
        byte myByte1 = 100;
        short myShort1 = myByte1;
        int myInt1 = myShort1;
        long myLong1 = myInt1;
        float myFloat1 = myLong1;
        double myDouble1 = myFloat1;

        System.out.println("Valor original: " + myByte1);
        System.out.println("Valor en short: " + myShort1);
        System.out.println("Valor en int: " + myInt1);
        System.out.println("Valor en long: " + myLong1);
        System.out.println("Valor en float: " + myFloat1);
        System.out.println("Valor en double: " + myDouble1);
        
        System.out.println("\n");
        //3//
        byte myByte2 = 100;
        myByte2 = (byte) (myByte2 * 2);

        System.out.println("Valor original: 100");
        System.out.println("Valor multiplicado por 2: " + myByte2);

    }
	}

