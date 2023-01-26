import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class gestionFichero {

	private String nombreFichero;

	public gestionFichero(String nombreFichero) {
		super();
		this.nombreFichero = nombreFichero;
	}

	public boolean escribirFichero(ArrayList<cancion> canciones) {
		boolean haEscrito = true;
		try {
			FileWriter fw = new FileWriter(nombreFichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (cancion micancion : canciones)
				bw.write(micancion.getNombreCancion() + " - " + micancion.getGrupo() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			haEscrito = false;
		}
		return haEscrito;
	}
	
	public ArrayList<cancion> leerFichero(){
		ArrayList<cancion> Miscanciones = new ArrayList<cancion>();
		cancion miCancion = new cancion();
		String linea = "";
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				String campos[] = linea.split(" - ");
				miCancion.setNombreCancion(campos[0]);
				miCancion.setGrupo(campos[1]);
				Miscanciones.add(miCancion);
			}
			br.close();
			fr.close();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No existe el fichero");
		}
		return Miscanciones;
	}

}
