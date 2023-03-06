
public class Paciente {

	private String DNI, Nombre, Apellidos;
	private int NumeroPoliza;

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(String dNI, String nombre, String apellidos, int numeroPoliza) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		NumeroPoliza = numeroPoliza;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getNumeroPoliza() {
		return NumeroPoliza;
	}

	public void setNumeroPoliza(int numeroPoliza) {
		NumeroPoliza = numeroPoliza;
	}

}
