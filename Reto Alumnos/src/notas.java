import java.util.ArrayList;
import javax.swing.JOptionPane;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<alumno> listaAlumnos = new ArrayList<alumno>();
		gestionFichero gf = new gestionFichero(
				JOptionPane.showInputDialog("Escribe el nombre del fichero donde quieres guardas las notas"));
		String opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
				+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
				+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		while (!opt.equals("S"))
			switch (opt) {
			case "A":
				alumno a = new alumno();
				a.setDNIAlumno(JOptionPane.showInputDialog("Escriba el DNI del alumno"));
				a.setNombreAlumno(JOptionPane.showInputDialog("Escriba el nombre del alumno"));
				a.setCicloformativo(JOptionPane.showInputDialog("Escriba el ciclo formativo actual"));
				a.setModuloAlumno(JOptionPane.showInputDialog("Escriba el modulo de la nota"));
				a.setNotaAlumno(JOptionPane.showInputDialog("Escriba la nota que va a subir"));
				listaAlumnos.add(a);
				gf.escribir(a);		
			case "L":
			case "B":
			case "M":
			case "C":
			default:
			}
	}

}
