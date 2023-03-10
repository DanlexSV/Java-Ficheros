import java.util.ArrayList;

import javax.swing.JOptionPane;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		util util = new util();
		String opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
				+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
				+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		gestionFichero gf = new gestionFichero(JOptionPane.showInputDialog("Escribe el nombre del fichero"));
		while (!opt.equals("S")) {
			switch (opt) {
			case "A":
				alumno alumno = new alumno();
				altaAlumno(alumno);
				gf.escribir(alumno);
				break;
			case "L":
				ArrayList<alumno> alumnos = new ArrayList<alumno>();
				alumnos = gf.leer();
				util.printar(alumnos);
				break;
			case "B":
				ArrayList<alumno> contenido = new ArrayList<alumno>();
				String DNI = JOptionPane.showInputDialog("Escribe el DNI del alumno");
				util.borrar(contenido, DNI, gf);
				break;
			case "M":
				ArrayList<alumno> listaalum = new ArrayList<alumno>();
				String dNI = JOptionPane.showInputDialog("Escribe el DNI del alumno");
				String Modulo = JOptionPane.showInputDialog("Escribe el modulo donde se modificara la nota");
				util.modificar(listaalum, dNI, Modulo, gf);
				break;
			case "C":
				ArrayList<alumno> modulonotas = new ArrayList<alumno>();
				String modulo = JOptionPane.showInputDialog("Escribe el modulo");
				util.consultar(modulonotas, modulo, gf);
				break;
			default:
			}
			opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
					+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
					+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		}
	}

	private static void altaAlumno(alumno alumno) {
		alumno.setDNIAlumno(JOptionPane.showInputDialog("Escriba el DNI del alumno").toUpperCase());
		alumno.setNombreAlumno(JOptionPane.showInputDialog("Escriba el nombre del alumno"));
		alumno.setCicloformativo(JOptionPane.showInputDialog("Escriba el ciclo formativo actual"));
		alumno.setModuloAlumno(JOptionPane.showInputDialog("Escriba el modulo de la nota"));
		alumno.setNotaAlumno(Double.parseDouble(JOptionPane.showInputDialog("Escriba la nota del alumno")));
	}

}
