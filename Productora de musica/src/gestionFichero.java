import java.io.*;
import java.util.ArrayList;

public class gestionFichero {

	String nombreFicheroCanciones;
	String nombreFicheroGrupo;
	String nombreFicheroCantantes;

	public gestionFichero() {
		super();
		// TODO Auto-generated constructor stub
		nombreFicheroCanciones = "Canciones.txt";
		nombreFicheroGrupo = "Grupo.txt";
		nombreFicheroCantantes = "Cantantes.txt";
	}

	public gestionFichero(String nombreFicheroCanciones, String nombreFicheroGrupo, String nombreFicheroCantantes) {
		super();
		this.nombreFicheroCanciones = nombreFicheroCanciones;
		this.nombreFicheroGrupo = nombreFicheroGrupo;
		this.nombreFicheroCantantes = nombreFicheroCantantes;
	}

	public void escribirCantante(Cantantes c) {
		try {
			FileWriter fw = new FileWriter(nombreFicheroCantantes, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(c.getNombreArtistico() + " - " + c.getDNIcantante() + " - " + c.getNombreCantante() + " - "
					+ c.getApellidoCantante() + " - " + c.getFechaNac() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void escribirDisco(Discos d) {
		try {
			FileWriter fw = new FileWriter(nombreFicheroCanciones, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(d.getTitulo() + " - " + d.getNombreCantante_Grupo() + " - " + d.getFechaPublicacion() + " - "
					+ d.getCanciones() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	

	public void escribirGrupo(Grupos g) {
		try {
			FileWriter fw = new FileWriter(nombreFicheroGrupo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(g.getNombreGrupo() + " - " + g.getIntegrantes() + " - " + g.getFechaCreacion() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Cantantes> leerCantante() {
		ArrayList<Cantantes> listaCantantes = new ArrayList<Cantantes>();
		try {
			FileReader fr = new FileReader(nombreFicheroCantantes);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					String[] campos = linea.split(" - ");
					Cantantes can = new Cantantes();
					can.setNombreArtistico(campos[0]);
					can.setDNIcantante(campos[1]);
					can.setNombreCantante(campos[2]);
					can.setApellidoCantante(campos[3]);
					can.setFechaNac(campos[4]);
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return listaCantantes;
	}

	public ArrayList<Discos> leerDisco() {
		ArrayList<Discos> listaDiscos = new ArrayList<Discos>();
		try {
			FileReader fr = new FileReader(nombreFicheroCanciones);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					String[] campos = linea.split(" - ");
					Discos dis = new Discos();
					dis.setTitulo(campos[0]);
					dis.setNombreCantante_Grupo(campos[1]);
					dis.setFechaPublicacion(campos[2]);
					dis.setCanciones(campos[3]);
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return listaDiscos;
	}

	public ArrayList<Grupos> leerGrupos() {
		ArrayList<Grupos> listaGrupos = new ArrayList<Grupos>();
		try {
			FileReader fr = new FileReader(nombreFicheroGrupo);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while (linea != null) {
				linea = br.readLine();
				if (linea != null) {
					String[] campos = linea.split(" - ");
					Grupos gr = new Grupos();
					gr.setNombreGrupo(campos[0]);
					gr.setIntegrantes(campos[1]);
					gr.setFechaCreacion(campos[2]);
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return listaGrupos;
	}
}
