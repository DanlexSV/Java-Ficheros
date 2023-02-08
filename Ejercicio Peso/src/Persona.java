import javax.swing.JOptionPane;

public class Persona {
	/* Atributos */
	private String nombre, DNI;
	private char sexo;
	private int edad;
	private double peso, altura;
	
	/* Constructor */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public Persona(String nombre, String dNI, char sexo, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	/* Setter */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/*Metodos */
	public int calcularMC() {
		int PI;
		double pesoIdeal;
		// peso = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu peso actual en kilogramos"));
		// altura = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu altura actual en metros"));
		pesoIdeal = (peso / (altura * altura));
		if (pesoIdeal < 20)
			PI = -1;
		else if (pesoIdeal >= 20 && pesoIdeal <= 25)
			PI = 0;
		else 
			PI = 1;
		return PI;
	}
	public boolean esMayorDeEdad() {
		boolean esMayor;
		// edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad actual"));
		if (edad >= 18)
			esMayor = true;
		else
			esMayor = false;
		return esMayor;
	}
}
