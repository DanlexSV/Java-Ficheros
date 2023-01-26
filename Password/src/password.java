
public class password {
	/* Atributos */
	public int longitud;
	public String contraseña;

	/* Constructor por defecto */
	public password() {
		super();
		// TODO Auto-generated constructor stub
		longitud = 8;
		contraseña = "";
	}

	/* Metodos */
	public boolean esFuerte() {
		boolean esfuerte = false;
		int digitos = 0;
		for (int i = 0; i < contraseña.length(); i++)
			if (Character.isDigit(contraseña.charAt(i)))
				digitos++;
		if (digitos >= 8)
			esfuerte = true;
		return esfuerte;
	}

	public void crearContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
