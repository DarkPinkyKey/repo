package prueba;

public class Excercice_diapo322_ej2 {

	public static void main(String[] args) {
		  identifyWrapper(String.class);
	        identifyWrapper(int.class);
	        identifyWrapper(long.class);
	        identifyWrapper(Double.class);
	    }

	    public static void identifyWrapper(Class<?> dataType) {
	        if (dataType.isPrimitive()) {
	            switch (dataType.getName()) {
	                case "boolean":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Boolean.class.getName());
	                    break;
	                case "byte":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Byte.class.getName());
	                    break;
	                case "short":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Short.class.getName());
	                    break;
	                case "int":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Integer.class.getName());
	                    break;
	                case "long":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Long.class.getName());
	                    break;
	                case "float":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Float.class.getName());
	                    break;
	                case "double":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Double.class.getName());
	                    break;
	                case "char":
	                    System.out.println("El tipo de dato primitivo " + dataType.getName() + " se convertiría a " + Character.class.getName());
	                    break;
	                default:
	                    System.out.println("Tipo de dato primitivo no identificado");
	            }
	        } else {
	            System.out.println("El tipo de dato " + dataType.getName() + " es un objeto (no primitivo).");
	        }


	}

}
