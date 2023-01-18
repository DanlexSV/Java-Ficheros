
public class componentes {
	/*Atributos*/
	private String NombreComponente;
	private int Identificador, Stock;
	private double Precio;
	
	/*Consturctor*/
	public componentes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Getter & Setter*/
	public String getNombreComponente() {
		return NombreComponente;
	}

	public void setNombreComponente(String nombreComponente) {
		NombreComponente = nombreComponente;
	}

	public int getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
		
}
