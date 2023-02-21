import javax.swing.JOptionPane;

public class Utilidades {

	public void altaCantante() {
		Cantantes c = new Cantantes();
		c.setNombreCantante(JOptionPane.showInputDialog("Escribe el nombre del cantante"));
		c.setApellidoCantante(JOptionPane.showInputDialog("Escribe el apellido del cantante"));
		c.setDNIcantante(JOptionPane.showInputDialog("Escribe el DNI del cantante"));
		c.setFechaNac(JOptionPane.showInputDialog("Escribe su fecha de nacimiento"));
		c.setNombreArtistico(JOptionPane.showInputDialog("Escriba su nombre artistico"));
	}

	public void altaGrupo() {
		Grupos g = new Grupos();
		g.setNombreGrupo(JOptionPane.showInputDialog("Escribe el nombre del grupo"));
		g.setFechaCreacion(JOptionPane.showInputDialog("Escribe si fecha de creacion"));
	}

	public void altaDisco() {

	}

	public void consultarCantante() {

	}

	public void consultarGrupo() {

	}
	
	
}
