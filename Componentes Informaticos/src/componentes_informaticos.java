import java.util.ArrayList;
import javax.swing.JOptionPane;

public class componentes_informaticos {

	static ArrayList<componentes> listacomp = new ArrayList<componentes>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcion = JOptionPane.showInputDialog("A ~ Dar de alta un componente" + "\n" +
				"L ~ Listar los componentes" + "\n" + "C ~ Salir" + "\n" + 
				"Escriba una opcion").toUpperCase();
		
		while (!opcion.equals("C")) {
			switch (opcion) {
			case "A": registrar(); break;
			case "L": listado(); break;
			default: JOptionPane.showMessageDialog(null, "Opcion no valida"); break;
			}
		}
		
	}
	
	private static void listado() {
		for (componentes milista:listacomp)
			JOptionPane.showMessageDialog(null, milista.getNombreComponente() + " ~ " + 
				milista.getIdentificador() + ": " + milista.getPrecio() + 
				", en Stock: " + milista.getStock());
	}

	private static void registrar() {
		for (int i = 0; i < 3; i++) {
			componentes comp = new componentes();
			comp.setNombreComponente(JOptionPane.showInputDialog("Escribe el nombre del componente"));
			comp.setIdentificador(Integer.parseInt(JOptionPane.showInputDialog("Escribe el identificador del componente")));
			comp.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio del componente")));
			comp.setStock(Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad en Stock del componente")));
			listacomp.add(comp);
		}
	}
	
}
