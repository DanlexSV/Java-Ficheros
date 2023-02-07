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
		ArrayList<alumno> misnotas = new ArrayList<alumno>();
		String linea = "";
		alumno minota = new alumno();
		File file = new File(nombreFichero);
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(nombreFichero);
				BufferedReader br = new BufferedReader(fr);
				while ((linea = br.readLine()) != null) {
					String[] spt = linea.split("\n");
					String campo[] = linea.split(" - ");
					String[][] matriz = new String[spt.length][campo.length];
					for (int i = 0; i < matriz.length; i++) {
						matriz[i][0] = campo[0];
						matriz[i][1] = campo[1];
						matriz[i][2] = campo[2];
						matriz[i][3] = campo[3];
						matriz[i][4] = campo[4];
						minota.setDNIAlumno(matriz[i][0]);
						minota.setNombreAlumno(matriz[i][1]);
						minota.setCicloformativo(matriz[i][2]);
						minota.setModuloAlumno(matriz[i][3]);
						minota.setNotaAlumno(matriz[i][4]);
					}
					misnotas.add(minota);
				}
				br.close();
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else
			JOptionPane.showMessageDialog(null, "Este fichero no existe つ ◕_◕ つ");
		return misnotas;
	}

}
