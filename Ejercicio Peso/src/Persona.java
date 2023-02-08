
public class Persona {
	/* Atributos */
	private String nombre, DNI, sexo;
	private int edad, peso, altura;
	
	/* Constructor */
	public Persona() {
		edad = 0;
		peso = 0;
		altura = 0;
		nombre = "";
		sexo = "hombre";
	}
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		edad = 0;
		peso = 0;
	}
	public Persona(String nombre, String sexo, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	
}
