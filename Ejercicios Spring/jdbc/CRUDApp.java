package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUDApp {

    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost:3306/db_test";
        final String user = "root";
        final String pass = "admin";

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Selecciona una opción:");
                System.out.println("1. Crear usuario");
                System.out.println("2. Leer usuarios");
                System.out.println("3. Actualizar usuario");
                System.out.println("4. Eliminar usuario");
                System.out.println("5. Salir");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (option) {
                    case 1:
                        createUser(connection, scanner);
                        break;
                    case 2:
                        readUsers(connection);
                        break;
                    case 3:
                        updateUser(connection, scanner);
                        break;
                    case 4:
                        deleteUser(connection, scanner);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción inválida, intenta de nuevo.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createUser(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del usuario:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Ingrese la nacionalidad del usuario:");
        String nacionalidad = scanner.nextLine();

        String insertQuery = "INSERT INTO db_test.usuarios(nombre, edad, nacionalidad) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.setString(3, nacionalidad);
            statement.executeUpdate();
            System.out.println("Usuario creado exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear el usuario: " + e.getMessage());
        }
    }

    private static void readUsers(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM db_test.usuarios";
        try (PreparedStatement statement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id_usuarios = resultSet.getInt("id_usuarios");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                String nacionalidad = resultSet.getString("nacionalidad");
                System.out.println("ID: " + id_usuarios + ", Nombre: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad);
            }
        } catch (SQLException e) {
            System.err.println("Error al leer usuarios: " + e.getMessage());
        }
    }

    private static void updateUser(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Ingrese el ID del usuario que desea actualizar:");
        int id_usuarios = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Ingrese el nuevo nombre del usuario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la nueva edad del usuario:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Ingrese la nueva nacionalidad del usuario:");
        String nacionalidad = scanner.nextLine();

        String updateQuery = "UPDATE db_test.usuarios SET nombre = ?, edad = ?, nacionalidad = ? WHERE id_usuarios = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.setString(3, nacionalidad);
            statement.setInt(4, id_usuarios);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Usuario actualizado exitosamente.");
            } else {
                System.out.println("No se encontró ningún usuario con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar el usuario: " + e.getMessage());
        }
    }

    private static void deleteUser(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Ingrese el ID del usuario que desea eliminar:");
        int id_usuarios = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String deleteQuery = "DELETE FROM db_test.usuarios WHERE id_usuarios = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
            statement.setInt(1, id_usuarios);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Usuario eliminado exitosamente.");
            } else {
                System.out.println("No se encontró ningún usuario con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar el usuario: " + e.getMessage());
        }
    }
}
