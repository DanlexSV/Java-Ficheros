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
			boolean esigual = true;
			for (int i = 0; i < contenidoFichero.size(); i++)
				if (contenidoFichero.get(i).getDNIAlumno().equals(DNI)) {
					esigual = true;
					contenidoFichero.remove(i);
					i--;
				} else
					esigual = false;
			if (!esigual)
				JOptionPane.showMessageDialog(null, "El DNI ya ha sido eliminado o no existe つ ◕_◕ つ");
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
		saveFichero(contenidoFichero, gf);
		return haBorrado;
	}

	private void saveFichero(ArrayList<alumno> contenidoFichero, gestionFichero gf) {
		try {
			FileWriter fw = new FileWriter(gf.getNombreFichero());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenidoFichero + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public boolean modificar(ArrayList<alumno> misnotas, String DNI, String Modulo, String Nuevanota,
			gestionFichero gf) {
		boolean haModificado = true;
		ArrayList<alumno> contenidoFi = new ArrayList<alumno>();
		contenidoFi = gf.leer();
		File file = new File(gf.toString());
		if (file.exists()) {
			for (int i = 0; i < contenidoFi.size(); i++) {
				if (contenidoFi.get(i).getDNIAlumno().equals(DNI)) {

				}
			}
		}
		return haModificado;
	}

	public void consultar(ArrayList<alumno> misnotas, alumno a) {
		misnotas.clear();
		for (int i = 0; i < misnotas.size(); i++) {
			if (misnotas.get(i).equals(a)) {
				JOptionPane.showMessageDialog(null, a);
			} else
				JOptionPane.showMessageDialog(null, "No existe el Modulo solicitado つ ◕_◕ つ");
		}
	}
}
