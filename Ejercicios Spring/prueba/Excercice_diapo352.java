package prueba;

import java.util.ArrayList;

public class Excercice_diapo352 {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnosList = new ArrayList<Alumno>();
        // Añadiendo alumnos al arrayList
        alumnosList.add(new Alumno("Juan", "Gomez", "Bachillerato", 2022));
        alumnosList.add(new Alumno("María", "López", "ESO", 2023));
        alumnosList.add(new Alumno("Pedro", "Martínez", "Primaria", 2025));

        // Tabla con formato alineado a la derecha
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%20s%20s%20s%20s%n", "Nombre", "Apellidos", "Curso", "Año");
        System.out.println("-----------------------------------------------------------");
        for (Alumno alumno : alumnosList) {
            System.out.printf("%20s%20s%20s%20d%n", alumno.getNombre(), alumno.getApellidos(), alumno.getCurso(),
                    alumno.getAnio());
        }
        System.out.println("-----------------------------------------------------------");

        // Tabla con formato alineado a la izquierda
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%n", "Nombre", "Apellidos", "Curso", "Año");
        System.out.println("-----------------------------------------------------------");
        for (Alumno alumno : alumnosList) {
            System.out.printf("%-20s%-20s%-20s%-20d%n", alumno.getNombre(), alumno.getApellidos(), alumno.getCurso(),
                    alumno.getAnio());
        }
        System.out.println("-----------------------------------------------------------");
    }

    public static class Alumno {
        private String nombre;
        private String apellidos;
        private String curso;
        private int anio;

        public Alumno(String nombre, String apellidos, String curso, int anio) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.curso = curso;
            this.anio = anio;
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }
    }
}
