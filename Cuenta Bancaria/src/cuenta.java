import javax.swing.JOptionPane;

public class cuenta {
	/*Atributos*/
	private String titular;
	private double cantidad;
	
	/*Constructor por defecto*/
	public cuenta(String titular) {
		super();
		// TODO Auto-generated constructor stub
		titular = "";
		cantidad = 0.0;
	}
	/*Constructor con un campo*/
	public cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*getter & setter*/
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}	
	
	public void ingresar (double cantidad) {
		if (cantidad > 0)
			this.cantidad += cantidad;
	}
	public void retirar (double cantidad) {
		if (this.cantidad > 0)
			this.cantidad = 0.0;
		else
			this.cantidad = this.cantidad - cantidad;
		}
	public void listar() {
		JOptionPane.showMessageDialog(null, titular + " dispones de: " + this.cantidad);
	}
}
