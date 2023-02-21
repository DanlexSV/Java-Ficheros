import java.io.*;

public class gestionFichero {

	private String nombreFichero;

	public gestionFichero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public gestionFichero(String nombreFichero) {
		super();
		this.nombreFichero = nombreFichero;
	}

	public void escribirCantante(Cantantes c) {
		try {
			FileWriter fw = new FileWriter("Cantantes.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(c.getNombreArtistico() + " - " + c.getDNIcantante() + " - " + c.getNombreCantante() 
					+ " - " + c.getApellidoCantante() + " - " + c.getFechaNac() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void escribirDisco (Discos d) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
