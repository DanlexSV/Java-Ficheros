import java.io.*;
import java.util.ArrayList;

public class GestionFichero {
	
	private String nombreFichero;
	
	public GestionFichero() {
		super();
		// TODO Auto-generated constructor stub
		nombreFichero = "stock.txt";
	}
	
	public GestionFichero(String nombreFichero) {
		super();
		this.nombreFichero = nombreFichero;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}
	
	public void escribir(Electrodomestico electro) {
		try {
			FileWriter fw = new FileWriter(nombreFichero);
			BufferedWriter bw = new BufferedWriter(fw);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<Electrodomestico> lectura(){
		ArrayList<Electrodomestico> productos = new ArrayList<Electrodomestico>();
		
		return productos;
	}
	
}
