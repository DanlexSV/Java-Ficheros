
public class cancion {
	/*Aquí van los atributos*/
	private String NombreCancion;
	private String Grupo;
	private int Anio;
	
	/*Constructor*/
	public cancion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*getter y setter*/
	public String getNombreCancion() {
		return NombreCancion;
	}
	public void setNombreCancion(String nombreCancion) {
		NombreCancion = nombreCancion;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
	public int getAnio() {
		return Anio;
	}
	public void setAnio(int anio) {
		Anio = anio;
	}
}
