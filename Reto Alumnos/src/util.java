import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class util {

	public void printar(ArrayList<alumno> alumnos) {
		String texto = "";
		for (alumno alumno : alumnos)
			texto += alumno.getDNIAlumno() + " - " + alumno.getNombreAlumno() + " - " + alumno.getCicloformativo()
					+ " - " + alumno.getModuloAlumno() + " - " + alumno.getNotaAlumno() + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}

	public boolean borrar(ArrayList<alumno> contenidoFichero, String DNI, gestionFichero gf) {
		boolean haBorrado = true;
		contenidoFichero = gf.leer();
		File f = new File(gf.getNombreFichero());
		if (f.exists()) {
			boolean esigual = false;
			for (int i = 0; i < contenidoFichero.size(); i++)
				if (contenidoFichero.get(i).getDNIAlumno().equals(DNI)) {
					esigual = true;
					contenidoFichero.remove(i);
					i--;
				}
			if (!esigual)
				JOptionPane.showMessageDialog(null, "El DNI no existe つ ◕_◕ つ");
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
		f.delete();
		saveFichero(contenidoFichero, gf);
		return haBorrado;
	}

	private void saveFichero(ArrayList<alumno> contenidoFichero, gestionFichero gf) {
		try {
			FileWriter fw = new FileWriter(gf.getNombreFichero());
			BufferedWriter bw = new BufferedWriter(fw);
			String texto = "";
			for (alumno alum : contenidoFichero)
				texto += alum.getDNIAlumno() + " - " + alum.getNombreAlumno() + " - " + alum.getCicloformativo() + " - "
						+ alum.getModuloAlumno() + " - " + alum.getNotaAlumno() + "\n";
			bw.write(texto);
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public boolean modificar(ArrayList<alumno> contenidoFi, String DNI, String Modulo, gestionFichero gf) {
		boolean haModificado = true;
		double nuevaNota;
		contenidoFi = gf.leer();
		File file = new File(gf.getNombreFichero());
		if (file.exists()) {
			boolean siModifico = false;
			for (int i = 0; i < contenidoFi.size(); i++) {
				if (contenidoFi.get(i).getDNIAlumno().equals(DNI)
						&& contenidoFi.get(i).getModuloAlumno().equals(Modulo)) {
					siModifico = true;
					nuevaNota = Double.parseDouble(JOptionPane.showInputDialog("Escribe la nueva nota del alumno"));
					contenidoFi.get(i).setNotaAlumno(nuevaNota);
				}
				gf.escribir(contenidoFi.get(i));
			}
			if (!siModifico)
				JOptionPane.showMessageDialog(null, "No se ha encontrado al alumno o su modulo つ ◕_◕ つ");
		} else
			JOptionPane.showMessageDialog(null, "El fichero no existe つ ◕_◕ つ");
		return haModificado;
	}

	public void consultar(ArrayList<alumno> misnotas, String modulo, gestionFichero gf) {
		misnotas = gf.leer();
		String texto = "";
		File file = new File(gf.getNombreFichero());
		if (file.exists()) {
			boolean existeModulo = false;
			for (int i = 0; i < misnotas.size(); i++)
				if (misnotas.get(i).getModuloAlumno().equals(modulo)) {
					existeModulo = true;
					texto += misnotas.get(i) + "\n";
				}
			JOptionPane.showMessageDialog(null, texto);
			if (!existeModulo)
				JOptionPane.showMessageDialog(null, "No se ha encontrado el modulo つ ◕_◕ つ");
		} else
			JOptionPane.showMessageDialog(null, "El fichero no existe つ ◕_◕ つ");
	}
}
