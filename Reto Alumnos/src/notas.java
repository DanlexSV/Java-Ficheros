import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alumno a = new alumno();
		ArrayList<alumno> listaAlumnos = new ArrayList<alumno>();
		String NombreFichero = null;
		gestionFichero gf = new gestionFichero(NombreFichero);
		String opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
				+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
				+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		while (!opt.equals("S"))
			switch (opt) {
			case "A":
				NombreFichero = JOptionPane.showInputDialog("Escribe el nombre del fichero donde quieres guardas las notas");
				a.setDNIAlumno(JOptionPane.showInputDialog("Escriba el DNI del alumno"));
				a.setNombreAlumno(JOptionPane.showInputDialog("Escriba el nombre del alumno"));
				a.setCicloformativo(JOptionPane.showInputDialog("Escriba el ciclo formativo actual"));
				a.setModuloAlumno(JOptionPane.showInputDialog("Escriba el modulo de la nota"));
				a.setNotaAlumno(JOptionPane.showInputDialog("Escriba la nota que va a subir"));
				listaAlumnos.add(a);
				gf.escribir(a);
				break;
			case "L": 
				NombreFichero = JOptionPane.showInputDialog("Escribe el nombre del fichero de donde quieres ver las notas");
				File file = new File(NombreFichero);
				if (file.exists())
					gf.leer();
				else 
					JOptionPane.showMessageDialog(null, "El fichero no existe つ ◕_◕ つ");
				break;
			case "B":
				util u = new util();
				NombreFichero = JOptionPane.showInputDialog("Escribe el nombre del fichero de donde quieres ver las notas");
				File fil = new File(NombreFichero);
				if (fil.exists()) {
					a.setDNIAlumno(JOptionPane.showInputDialog("Escribe el nombre del alumno que deseas eliminar"));
					u.borrar(listaAlumnos, a);
				}
				else 
					JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
				break;
			case "M":
			case "C":
			default:
			}
	}

}
