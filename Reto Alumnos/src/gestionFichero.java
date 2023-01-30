import java.io.*;
import java.util.ArrayList;

public class gestionFichero {
	
	private String nombreFichero;

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
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public ArrayList<alumno> leer(){
		ArrayList<alumno> misnotas = new ArrayList<alumno>();
		alumno minota = new alumno();
		String linea = "";
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				String campo[] = linea.split(" - ");
				minota.setDNIAlumno(campo[0]);
				minota.setNombreAlumno(campo[1]);
				minota.setCicloformativo(campo[2]);
				minota.setModuloAlumno(campo[3]);
				minota.setNotaAlumno(campo[4]);
				misnotas.add(minota);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return misnotas;
	}
	
}
