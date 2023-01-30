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
		
		return misnotas;
	}
	
}
