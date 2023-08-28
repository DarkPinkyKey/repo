package prueba;

public class Person {
    private String name;
    private int age;
    private String occupation;

    // Constructor vacío
    public Person() {
    }

    // Constructor con todos los atributos
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Getters y setters para cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static void main(String[] args) {
        // Crear objetos utilizando los constructores y métodos
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(30);
        person1.setOccupation("Engineer");

        Person person2 = new Person("Alice", 25, "Teacher");

        Person person3 = new Person();
        person3.setName("Bob");
        person3.setAge(40);
        person3.setOccupation("Doctor");

        // Mostrar información de los objetos
        System.out.println("Datos de la persona 1:");
        System.out.println("Nombre: " + person1.getName());
        System.out.println("Edad: " + person1.getAge());
        System.out.println("Ocupación: " + person1.getOccupation());
        System.out.println();

        System.out.println("Datos de la persona 2:");
        System.out.println("Nombre: " + person2.getName());
        System.out.println("Edad: " + person2.getAge());
        System.out.println("Ocupación: " + person2.getOccupation());
        System.out.println();

        System.out.println("Datos de la persona 3:");
        System.out.println("Nombre: " + person3.getName());
        System.out.println("Edad: " + person3.getAge());
        System.out.println("Ocupación: " + person3.getOccupation());
    }
}
