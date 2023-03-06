import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Grupos {
	
	private String nombreGrupo, fechaCreacion, Integrantes;
	//private ArrayList<String> Integrantes;
	
	public Grupos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getIntegrantes() {
		return Integrantes;
	}

	public void setIntegrantes(String integrantes) {
		Integrantes = integrantes;
	}

	/*public ArrayList<String> getIntegrantes() {
		return Integrantes;
	}

	public void setIntegrantes() {
		ArrayList<String> integrantes = new ArrayList<String>();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Cuantos integrantes son?"));
		for (int i = 0; i < num; i++) {
			String nombre = "";
			nombre = JOptionPane.showInputDialog("Escribe el nombre del integrante");
			integrantes.add(nombre);
		}
		Integrantes = integrantes;
	}*/
	
	
}
