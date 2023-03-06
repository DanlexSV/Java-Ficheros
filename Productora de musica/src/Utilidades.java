import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Utilidades {

	public void altaCantante() {
		Cantantes c = new Cantantes();
		gestionFichero gf = new gestionFichero();
		c.setNombreCantante(JOptionPane.showInputDialog("Escribe el nombre del cantante"));
		c.setApellidoCantante(JOptionPane.showInputDialog("Escribe el apellido del cantante"));
		c.setDNIcantante(JOptionPane.showInputDialog("Escribe el DNI del cantante"));
		c.setFechaNac(JOptionPane.showInputDialog("Escribe su fecha de nacimiento"));
		c.setNombreArtistico(JOptionPane.showInputDialog("Escriba su nombre artistico"));
		gf.escribirCantante(c);
	}

	public void altaGrupo() {
		Grupos g = new Grupos();
		gestionFichero gf = new gestionFichero();
		g.setNombreGrupo(JOptionPane.showInputDialog("Escribe el nombre del grupo"));
		g.setFechaCreacion(JOptionPane.showInputDialog("Escribe si fecha de creacion"));
		//g.setIntegrantes();
		String listaMiembros = "";
		
		while (JOptionPane.showInputDialog("Añadir nuevo miembro? \n" + "Y/N").equals("Y")) 
			listaMiembros += JOptionPane.showInputDialog("Escriba el nombre del nuevo miembro") + " ";
		g.setIntegrantes(listaMiembros);
		gf.escribirGrupo(g);
	}

	public void altaDisco() {
		Discos d = new Discos();
		gestionFichero gf = new gestionFichero();
		d.setNombreCantante_Grupo(JOptionPane.showInputDialog("Escriba el nombre del cantante o grupo"));
		if (existeCantante_Grupo(d.getNombreCantante_Grupo())) {
			d.setTitulo(JOptionPane.showInputDialog("Escriba el titulo del disco"));
			d.setFechaPublicacion(JOptionPane.showInputDialog("Escriba la fecha de publicacion"));
			String listaCanciones = "";
			
			while (JOptionPane.showInputDialog("Añadir nueva cancion? \n" + "Y/N").equals("Y"))
				listaCanciones += JOptionPane.showInputDialog("Escriba el nombre de la cancion");
			d.setCanciones(listaCanciones);
		}
		gf.escribirDisco(d);
	}
	
	public boolean existeCantante_Grupo(String nombreArtistico) {
		ArrayList<Cantantes> listaCantantes = new ArrayList<Cantantes>();
		ArrayList<Grupos> listaGrupos = new ArrayList<Grupos>();
		gestionFichero gf = new gestionFichero();
		listaCantantes = gf.leerCantante();
		for (Cantantes cantante: listaCantantes)
			if (cantante.getNombreArtistico().equals(nombreArtistico))
				return true;
		listaGrupos = gf.leerGrupos();
		for (Grupos grupo: listaGrupos)
			if (grupo.getNombreGrupo().equals(nombreArtistico))
				return true;
		return false;
	}

	public void printarDiscos(String nombreArtistico) {
		ArrayList<Discos> listaDiscos = new ArrayList<Discos>();
		gestionFichero gf = new gestionFichero();
		listaDiscos = gf.leerDisco();
		for (Discos disco: listaDiscos)
			if (disco.getNombreCantante_Grupo().equals(nombreArtistico))
				JOptionPane.showMessageDialog(null, disco.getTitulo());
	}
	
	
}
