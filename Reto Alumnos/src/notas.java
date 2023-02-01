import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class notas {

	static alumno a = new alumno();
	static util u = new util();
	static ArrayList<alumno> listaAlumnos = new ArrayList<alumno>();
	static String NombreFichero;
	static gestionFichero gf = new gestionFichero(NombreFichero);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
				+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
				+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		while (!opt.equals("S")) {
			switch (opt) {
			case "A":
				DarAlta();
				gf.escribir(a);
				break;
			case "L":
				Listado();
				break;
			case "B":
				Borrar();
				break;
			case "M":
				Modificar();
				break;
			case "C":
				Consultar();
				break;
			default:
			}
			opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
					+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
					+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		}
	}

	private static void Consultar() {
		NombreFichero = JOptionPane.showInputDialog("Escriba el nombre del Fichero");
		File file = new File(NombreFichero);
		if (file.exists()) {
			a.setModuloAlumno(JOptionPane.showInputDialog("Escriba el Modulo que queire consultar las notas"));
			listaAlumnos.add(a);
			u.consultar(listaAlumnos, a);
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
	}

	private static void Modificar() {
		NombreFichero = JOptionPane.showInputDialog("Escriba el nombre del Fichero");
		File file = new File(NombreFichero);
		if (file.exists()) {
			a.setDNIAlumno(JOptionPane.showInputDialog("Escrina el DNI del alumno"));
			a.setModuloAlumno(JOptionPane.showInputDialog("Escriba el Modulo donde quiere cambiar la nota"));
			a.setNotaAlumno(JOptionPane.showInputDialog("Escriba el valor de la nueva nota"));
			listaAlumnos.add(a);
			u.modificar(listaAlumnos, a);
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
	}

	private static void Borrar() {
		NombreFichero = JOptionPane.showInputDialog("Escriba el nombre del Fichero");
		File file = new File(NombreFichero);
		if (file.exists()) {
			a.setDNIAlumno(JOptionPane.showInputDialog("Escribe el DNI del alumno que deseas eliminar"));
			listaAlumnos.add(a);
			u.borrar(listaAlumnos, a);
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
	}

	private static void Listado() {
		listaAlumnos.clear();
		NombreFichero = JOptionPane.showInputDialog("Escriba el nombre del Fichero");
		listaAlumnos = gf.leer();
		u.printar(listaAlumnos);
	}

	private static void DarAlta() {
		NombreFichero = JOptionPane.showInputDialog("Escriba el nombre del Fichero");
		a.setDNIAlumno(JOptionPane.showInputDialog("Escriba el DNI del alumno"));
		a.setNombreAlumno(JOptionPane.showInputDialog("Escriba el nombre del alumno"));
		a.setCicloformativo(JOptionPane.showInputDialog("Escriba el ciclo formativo actual"));
		a.setModuloAlumno(JOptionPane.showInputDialog("Escriba el modulo de la nota"));
		a.setNotaAlumno(JOptionPane.showInputDialog("Escriba la nota que va a subir"));
		listaAlumnos.add(a);
	}

}
