import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class gestionFichero {
	
	private String nombreFichero;
	
	public gestionFichero(String nombreFichero) {
		super();
		this.nombreFichero = nombreFichero;
	}
	
	public boolean escribirFichero(ArrayList<cancion>canciones) {
		boolean haEscrito = true;
		try {
			FileWriter fw = new FileWriter(nombreFichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (cancion micancion: canciones)
				bw.write(micancion.getNombreCancion() + " - " + micancion.getGrupo() + "\n");
			bw.close();
			fw.close();
		}catch (Exception e) {
			// TODO: handle exception
			haEscrito = false;
		}
		return haEscrito;
	}

}
