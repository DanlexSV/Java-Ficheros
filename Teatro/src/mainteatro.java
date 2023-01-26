import javax.swing.JOptionPane;

public class mainteatro {

	public static int fila = 0, numeroButaca = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		teatro t = new teatro();
		String opt = JOptionPane.showInputDialog("V ~ Vender Butaca" + "\n" + "C ~ Cancelar venta" 
				+ "\n" + "L ~ Listar disponibles" + "\n" + "S ~ Salir" + "\n" + 
				"Escoja una de las opciones").toUpperCase();
		while (!opt.equals("S")) {
			switch(opt) {
			case "V":
				fila = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de fila donde quieres estar"));
				numeroButaca = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de la Butaca"));
				if (t.estaOcupado(fila, numeroButaca) == true)
					t.ocuparButaca(fila, numeroButaca);
				else
					JOptionPane.showMessageDialog(null, "La Butaca ya no esta disponible");
				break;
			case "C":
				fila = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de fula que quieres cancelar"));
				numeroButaca = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de la Butaca"));
				if (t.estaOcupado(fila, numeroButaca) == false)
					t.liberaButaca(fila, numeroButaca);
				else
					JOptionPane.showMessageDialog(null, "La Butaca no ha sido ocupada");
				break;
			case "L": t.listarDisponibles(); break;
			default:
			}
			opt = JOptionPane.showInputDialog("V ~ Vender Butaca" + "\n" + "C ~ Cancelar venta" 
					+ "\n" + "L ~ Listar disponibles" + "\n" + "S ~ Salir" + "\n" + 
					"Escoja una de las opciones").toUpperCase();
		}
	}

}
