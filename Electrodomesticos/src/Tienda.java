import javax.swing.JOptionPane;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, color;
		int peso, cantidad;
		char consumo;
		double precio;
		
		String opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
				+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
				+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
	}
}
