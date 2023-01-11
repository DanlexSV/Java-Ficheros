import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class gestor {

	static ArrayList<String>Agenda = new ArrayList<String>();
	static ArrayList<String>AgendaL = new ArrayList<String>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcion;
		opcion = JOptionPane.showInputDialog("Escriba una opcion");
		
		while (!opcion.equals("S")) {
			
			switch (opcion) {
			case "A": alta(); break;
			case "G": grabar();break;
			case "L": listar();break;
			case "B": borrar();break;
			default:  JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
				opcion = JOptionPane.showInputDialog("Escriba una opcion");
		}
	
	}

	private static void borrar() {
		// TODO Auto-generated method stub
		
		AgendaL.clear();
		leerFichero();
		String aborrar=JOptionPane.showInputDialog("Escriba el nombre del contacto a borrar");
		for (int i=0;i<AgendaL.size(); i++)
		{
			if (AgendaL.get(i).contains(aborrar)) {
				AgendaL.remove(i);
			}

		}
		File file = new File("Agenda.txt");
		file.delete();
		for (String Contacto:AgendaL)
		{
			saveFichero(Contacto);
		}
	}

	private static void listar() {
		// TODO Auto-generated method stub
		    AgendaL.clear();
		    leerFichero();
			printar();		
	}

	private static void leerFichero() {
		String linea="";
		try {
			FileReader fr = new FileReader("Agenda.txt");
			BufferedReader br = new BufferedReader(fr);
			while (linea!=null) {
			     linea=br.readLine();
			     if (linea!=null) {
				 AgendaL.add(linea);
			     }
			}
			br.close();
			fr.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No existe el fichero, no hay contactos");

		}
	}
	private static void printar() {
		// TODO Auto-generated method stub
		String texto="";
		for (String Contacto:AgendaL) {
			texto+=Contacto+"\n";
		}
		JOptionPane.showMessageDialog(null,texto);
	}

	private static void grabar() {
		// TODO Auto-generated method stub
		
		
			if (Agenda.size()>0) {
				for (String contacto:Agenda) {
					saveFichero(contacto);
				}
				Agenda.clear();
			}
				else {
					JOptionPane.showMessageDialog(null, "No hay elementos en la lista");
				}
		}
	

	private static void saveFichero(String contacto) {
		// TODO Auto-generated method stub
        try {
			FileWriter fr = new FileWriter("Agenda.txt",true);
			BufferedWriter bw = new BufferedWriter(fr);
			bw.write(contacto+"\n");
			bw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void alta() {
		// TODO Auto-generated method stub
		 String nombre = JOptionPane.showInputDialog("Escriba un nombre");
		String telf = JOptionPane.showInputDialog("Escriba un telefono");
		Agenda.add(nombre+","+telf);
	}

}
