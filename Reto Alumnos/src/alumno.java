
public class alumno {
	/* Atributos */
	private static String DNIAlumno;
	private static String nombreAlumno;
	private static String Cicloformativo;
	private static String moduloAlumno;
	private static String notaAlumno;

	/* Constructor */
	public alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* Getter and Setter */
	public static String getDNIAlumno() {
		return DNIAlumno;
	}

	public static void setDNIAlumno(String dNIAlumno) {
		DNIAlumno = dNIAlumno;
	}

	public static String getNombreAlumno() {
		return nombreAlumno;
	}

	public static void setNombreAlumno(String nombreAlumno) {
		alumno.nombreAlumno = nombreAlumno;
	}

	public static String getCicloformativo() {
		return Cicloformativo;
	}

	public static void setCicloformativo(String cicloformativo) {
		Cicloformativo = cicloformativo;
	}

	public static String getModuloAlumno() {
		return moduloAlumno;
	}

	public static void setModuloAlumno(String moduloAlumno) {
		alumno.moduloAlumno = moduloAlumno;
	}

	public static String getNotaAlumno() {
		return notaAlumno;
	}

	public static void setNotaAlumno(String notaAlumno) {
		alumno.notaAlumno = notaAlumno;
	}
}
