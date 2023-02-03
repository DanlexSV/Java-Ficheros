import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class gestionFichero {

	private String nombreFichero;

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	public gestionFichero(String nombreFichero) {
		super();
		this.nombreFichero = nombreFichero;
	}

	public void escribir(alumno a) {
		try {
			FileWriter fw = new FileWriter(nombreFichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(a.getDNIAlumno() + " - " + a.getNombreAlumno() + " - " + a.getCicloformativo() + " - "
					+ a.getModuloAlumno() + " - " + a.getNotaAlumno() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<alumno> leer() {
		ArrayList<alumno> alumnos = new ArrayList<alumno>();
		String linea = "";
		File file = new File(nombreFichero);
		if (file.exists()) {
			try {
				int num = 0;
				FileReader fr = new FileReader(nombreFichero);
				BufferedReader br = new BufferedReader(fr);
				while ((linea = br.readLine()) != null) {
					String campo[] = linea.split(" - ");
					alumno minota = new alumno();
					minota.setDNIAlumno(campo[num]);
					num++;
					minota.setNombreAlumno(campo[num]);
					num++;
					minota.setCicloformativo(campo[num]);
					num++;
					minota.setModuloAlumno(campo[num]);
					num++;
					minota.setNotaAlumno(campo[num]);
					num++;
					alumnos.add(minota);
				}
				br.close();
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
		return alumnos;
	}

}
