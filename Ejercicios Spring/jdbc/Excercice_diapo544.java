package jdbc;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Excercice_diapo544 {

	public static void main(String[] args) {
		 
        // Método con un parámetro
        JOptionPane.showInputDialog("Método con un parámetro");
 
        // Métodos con 2 parámetros
        // parentComponent y message
        JOptionPane.showInputDialog(null, "Método con 2 parámetros");
 
        // message y initialSelectionValue
        JOptionPane.showInputDialog("Método con 2 parámetros", "Valor inicial");
 
        // Método con 3 parámetros
        JOptionPane.showInputDialog(null, "Método con 3 parámetros", "Valor inicial");
 
        // Método con 4 parámetros
        JOptionPane.showInputDialog(null, "Método con 4 parámetros",
                "Título del diálogo", JOptionPane.INFORMATION_MESSAGE);
 
        // Método con 7 parámetros
        ImageIcon icono = new ImageIcon("resources/parentesisIcono.png");
 
        Object resp = JOptionPane.showInputDialog(null, "Método con 7 parámetros",
                "Título del diálogo", JOptionPane.INFORMATION_MESSAGE,
                icono, new Object[] { "Opción 1","Opción 2", "Opción 3", "Opción 4" },
                "Opción 2");
 
        JOptionPane.showMessageDialog(null, resp,
                "Selección", JOptionPane.INFORMATION_MESSAGE);
 
    }
 
}