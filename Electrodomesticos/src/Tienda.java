import javax.swing.JOptionPane;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String nombre, color;
		int peso, cantidad;
		char consumo;
		double precio;*/
		Electrodomestico e = new Electrodomestico();
		JOptionPane.showMessageDialog(null, "Hola! Bienvenido \n" + 
				"a continuecion escriba los productos de su tienda");
		String ask = JOptionPane.showInputDialog("Quieres agregar un producto nuevo? \n"
				+ "y/n").toLowerCase();
		if (ask.equals("y")) {
			
		}
		
		String opt = JOptionPane.showInputDialog("L ~ Listar el contenido \n" + "C ~ Consultar el stock \n" 
				+ "V ~ Vender un producto \n" + "S ~ Salir \n" + "Escoja una de las opciones").toUpperCase();
		GestionFichero gf = new GestionFichero(JOptionPane.showInputDialog("Escribe el nombre del fichero"));
		while (opt.equals("S")) {
			switch(opt) {
			case "A": 
				Alta(e);
				gf.escribir(e);
				break;
			case "L": 
			default: 
				JOptionPane.showMessageDialog(null, "Valor introducido no reconocible \n" 
						+ "Favor escriba una opcion valida");
			}
			opt = JOptionPane.showInputDialog("A ~ Alta al alumno" + "\n" + "L ~ Listar las notas" + "\n"
					+ "B ~ Borrar nota" + "\n" + "M ~ Modificar una nota" + "\n" + "C ~ Consultar las notas" + "\n"
					+ "S ~ Salir" + "\n" + "Escoja una de las opciones").toUpperCase();
		}
	}
	
	private static void Alta(Electrodomestico e) {
		e.setNombre(JOptionPane.showInputDialog("Escribe el nombre del producto"));
		e.setPrecio_base(Double.parseDouble(JOptionPane.showInputDialog("Escribe su precio base")));
		e.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Escribe su peso")));
		e.setColor(JOptionPane.showInputDialog("Escribe el color del producto"));
		e.setConsumo_energetico(JOptionPane.showInputDialog("Escriba su consumo energetico").charAt(0));
		e.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Escriba ña cantidad a ingresar")));
	}
}
