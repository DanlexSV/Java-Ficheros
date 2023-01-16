import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class gestor_entradas {
	
	static ArrayList<String>Agenda = new ArrayList<String>();
	static ArrayList<String>AgendaE = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcion;
		opcion = JOptionPane.showInputDialog("A ~ Alta de entradas" + "\n" +
				"G ~ Grabar los datos" + "\n" + "L ~ Listar el contenido" + "\n" + 
				"B ~ Borrar un dato" + "\n" + "M ~ Modificar una entrada" + "\n" +
				"S ~ Salir" + "\n" + "Escriba una opcion").toUpperCase();
		
		while (!opcion.equals("S")) {
			
			switch (opcion) {
			case "A": alta(); break;
			case "G": grabar(); break;
			case "L": listar(); break;
			case "B": borrar(); break;
			case "M": modificar(); break;
			default: JOptionPane.showMessageDialog(null, "Opcion incorrecta"); break;
			}
			opcion = JOptionPane.showInputDialog("A ~ Alta de entradas" + "\n" +
					"G ~ Grabar los datos" + "\n" + "L ~ Listar el contenido" + "\n" + 
					"B ~ Borrar un dato" + "\n" + "M ~ Modificar una entrada" + "\n" +
					"S ~ Salir" + "\n" + "Escriba una opcion").toUpperCase();
		}
	}
	
	private static void modificar() {
		AgendaE.clear();
		leerFichero();
		String cambio = JOptionPane.showInputDialog("Escriba el nombre del evento para modificarlo");
		for (int i = 0; i < AgendaE.size(); i++)
			if (AgendaE.get(i).contains(cambio)) {
				AgendaE.remove(i);
				String newCantidad = JOptionPane.showInputDialog("Escriba la nueva cantidad");
				String newPU = JOptionPane.showInputDialog("Escriba el nuevo precio de unidad");
				AgendaE.add(i, cambio + ", " + newCantidad + ", " + newPU);
			}
		File file = new File("Agenda.txt");
		file.delete();
		for (String Contacto:AgendaE)
			saveFichero(Contacto);
	}
	
	private static void borrar() {		
		AgendaE.clear();
		leerFichero();
		String delete = JOptionPane.showInputDialog("Escriba el nombre del evento a borrar");
		for (int i = 0; i < AgendaE.size(); i++)
			if (AgendaE.get(i).contains(delete))
				AgendaE.remove(i);
		File file = new File("Agenda.txt");
		file.delete();
		for (String Contacto:AgendaE)
			saveFichero(Contacto);
	}
	
	private static void listar() {		
		AgendaE.clear();
		leerFichero();
		printar();
	}
	
	private static void leerFichero() {		
		String linea = "";
		try {
			FileReader fr = new FileReader("Agenda.txt");
			BufferedReader br = new BufferedReader(fr);
			while (linea != null) {
				linea = br.readLine();
				if (linea != null)
					AgendaE.add(linea);
			}
			br.close();
			fr.close();
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "No existe el fichero, no hay eventos");
		}
	}
	
	private static void printar() {		
		String texto = "";
		for (String Contacto:AgendaE)
			texto += Contacto + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}
	
	private static void grabar() {		
		if (Agenda.size()>0) {
			for(String contacto:Agenda)
				saveFichero(contacto);
			Agenda.clear();
		} else
			JOptionPane.showMessageDialog(null, "No hay elementos en la lista");
	}
	
	private static void saveFichero(String contacto) {		
		try {
			FileWriter fw = new FileWriter("Agenda.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contacto + "\n");
			bw.close();
			fw.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void alta() {		
		String evento = JOptionPane.showInputDialog("Escriba el nombre del evento");
		String cantidad = JOptionPane.showInputDialog("Escriba cuantas entradas comprará");
		String precio = JOptionPane.showInputDialog("Escriba el precio de la entrada");
		Agenda.add(evento + ", " + cantidad + ", " + precio);
	}
}
