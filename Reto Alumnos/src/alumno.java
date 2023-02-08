
public class alumno {
	/* Atributos */
	private String DNIAlumno;
	private String nombreAlumno;
	private String Cicloformativo;
	private String moduloAlumno;
	private double notaAlumno;

	/* Constructor */
	public alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* Getter and Setter */
	public String getDNIAlumno() {
		return DNIAlumno;
	}

	public void setDNIAlumno(String dNIAlumno) {
		DNIAlumno = dNIAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String n) {
		nombreAlumno = n;
	}

	public String getCicloformativo() {
		return Cicloformativo;
	}

	public void setCicloformativo(String cicloformativo) {
		Cicloformativo = cicloformativo;
	}

	public String getModuloAlumno() {
		return moduloAlumno;
	}

	public  void setModuloAlumno(String moduloAlumno) {
		this.moduloAlumno = moduloAlumno;
	}

	public double getNotaAlumno() {
		return notaAlumno;
	}

	public void setNotaAlumno(double notaAlumno) {
		this.notaAlumno = notaAlumno;
	}
	
}
