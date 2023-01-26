import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class gestionFichero {
	
	private static String NombreFichero;

	public gestionFichero(String NombreFichero) {
		super();
		// TODO Auto-generated constructor stub
		this.NombreFichero = NombreFichero;
	}
	
	public void Escribir(alumno a) {
		Declaracion_variables(a);
		try {
			FileWriter fw = new FileWriter(NombreFichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(a.getDNIAlumno() + " - " + a.getNombreAlumno() + " - " + a.getCicloformativo() 
				+ " - " + a.getModuloAlumno() + " - " + a.getNotaAlumno() + "\n");
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
			FileReader fr = new FileReader(NombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				String campos[] = linea.split(" - ");
				minota.setDNIAlumno(campos[0]);
				minota.setNombreAlumno(campos[1]);
				minota.setCicloformativo(campos[2]);
				minota.setModuloAlumno(campos[3]);
				minota.setNombreAlumno(campos[4]);
				misnotas.add(minota);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return misnotas;
	}

	private void Declaracion_variables(alumno a) {
		a = new alumno();
		a.setDNIAlumno(JOptionPane.showInputDialog("Escriba el DNI del alumno"));
		a.setNombreAlumno(JOptionPane.showInputDialog("Escriba el nombre del alumno"));
		a.setCicloformativo(JOptionPane.showInputDialog("Escriba el ciclo formativo del alumon"));
		a.setModuloAlumno(JOptionPane.showInputDialog("Escriba el modulo de la nota"));
		a.setNotaAlumno(JOptionPane.showInputDialog("Escriba la nota a publicar"));
	}
	
}
