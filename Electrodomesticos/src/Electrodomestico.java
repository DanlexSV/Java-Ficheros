
public class Electrodomestico {

	private double precio_base;
	private int peso, cantidad;
	private String color, Nombre;
	private char consumo_energetico;

	/* Definimos constantes */
	final double precio_Base = 100;
	final String Color = "blanco";
	final char Consumo = 'F';
	final int Peso = 5;

	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
		color = Color;
		consumo_energetico = Consumo;
		peso = Peso;
		precio_base = precio_Base;
	}

	public Electrodomestico(double precio_base, int peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		color = Color;
		consumo_energetico = Consumo;
	}

	public Electrodomestico(double precio_base, int peso, String color, char consumo_energetico) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		if (comprobarColor(color))
			this.color = color;
		else
			this.color = Color;
		if (comprobarConsumoEnergetico(consumo_energetico))
			this.consumo_energetico = consumo_energetico;
		else
			this.consumo_energetico = Consumo;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F')
			return true;
		return false;
	}

	private boolean comprobarColor(String color) {
		color = color.toLowerCase();
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul")
				|| color.equals("gris"))
			return true;
		return false;
	}
	
	public double precioFinal() {
		double precionew = 0;
		switch (consumo_energetico) {
		case 'A': 
			precionew = getPrecio_base() + 100;
			break;
		case 'B':
			precionew = getPrecio_base() + 80;
			break;
		case 'C':
			precionew = getPrecio_base() + 60;
			break;
		case 'D':
			precionew = getPrecio_base() + 50;
			break;
		case 'E':
			precionew = getPrecio_base() + 30;
			break;
		case 'F':
			precionew = getPrecio_base() + 10;
			break;
		}
		return precionew;
	}
	
}
