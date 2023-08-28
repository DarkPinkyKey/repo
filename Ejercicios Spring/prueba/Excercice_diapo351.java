package prueba;



public class Excercice_diapo351 {
		 private int atributo1;
		    private String atributo2;
		    private double atributo3;

		    // Constructor vacío
		    public Excercice_diapo351() {
		    }

		    // Constructor con todos los atributos
		    public Excercice_diapo351(int atributo1, String atributo2, double atributo3) {
		        this.atributo1 = atributo1;
		        this.atributo2 = atributo2;
		        this.atributo3 = atributo3;
		    }

		    // Getters y Setters
		    public int getAtributo1() {
		        return atributo1;
		    }

		    public void setAtributo1(int atributo1) {
		        this.atributo1 = atributo1;
		    }

		    public String getAtributo2() {
		        return atributo2;
		    }

		    public void setAtributo2(String atributo2) {
		        this.atributo2 = atributo2;
		    }

		    public double getAtributo3() {
		        return atributo3;
		    }

		    public void setAtributo3(double atributo3) {
		        this.atributo3 = atributo3;
		    }

		    public static void main(String[] args) {
		        // Crear objetos usando los constructores
		    	Excercice_diapo351 objeto1 = new Excercice_diapo351();
		    	Excercice_diapo351 objeto2 = new Excercice_diapo351(42, "Hola", 3.14);
		    	Excercice_diapo351 objeto3 = new Excercice_diapo351(10, "Mundo", 2.71);

		        // Usar getters y setters para obtener y modificar atributos
		        objeto1.setAtributo1(100);
		        objeto1.setAtributo2("¡Hola!");
		        objeto1.setAtributo3(1.23);

		        int atributo1Objeto2 = objeto2.getAtributo1();
		        String atributo2Objeto2 = objeto2.getAtributo2();
		        double atributo3Objeto2 = objeto2.getAtributo3();

		        System.out.println("Objeto1: " + objeto1.getAtributo1() + ", " + objeto1.getAtributo2() + ", " + objeto1.getAtributo3());
		        System.out.println("Objeto2: " + atributo1Objeto2 + ", " + atributo2Objeto2 + ", " + atributo3Objeto2);
		        System.out.println("Objeto3: " + objeto3.getAtributo1() + ", " + objeto3.getAtributo2() + ", " + objeto3.getAtributo3());

	}
}
