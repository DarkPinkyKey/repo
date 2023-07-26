package jdbc;

import javax.swing.JOptionPane;
 

public class Excercice_diapo540 {

	  public static void main(String[] args) {
	 
	        JOptionPane.showMessageDialog(null, "Mensaje de información",
	                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	 
	        JOptionPane.showMessageDialog(null, "Keyla",
	                "Java", JOptionPane.WARNING_MESSAGE);
	 
	        JOptionPane.showMessageDialog(null, "Mensaje de Error",
	                "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
	 
	        JOptionPane.showMessageDialog(null, "Mensaje de pregunta",
	                "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
	        //Ejercicio diapo 541//
	        JOptionPane.showMessageDialog(null, "El total es: "
	        		+ "\n120€ (IVA 10% no incl.\n"
	        		+ "132€ (con IVA incl.)",
	                "Ticket", JOptionPane.INFORMATION_MESSAGE);
	    }
	}