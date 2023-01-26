import java.util.ArrayList;
import javax.swing.JOptionPane;

public class spotif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<cancion> listaCanciones = new ArrayList<cancion>();
		gestionFichero gf = new gestionFichero(
				JOptionPane.showInputDialog("Escriba el nombre del fichero donde quieres guardar la musica"));

		for (int i = 0; i < 3; i++) {
			cancion can = new cancion();
			can.setNombreCancion(JOptionPane.showInputDialog("Escriba el nombre de cancion"));
			can.setGrupo(JOptionPane.showInputDialog("Grupo"));
			listaCanciones.add(can);
		}
		if (gf.escribirFichero(listaCanciones))
			JOptionPane.showMessageDialog(null, "Se ha escrito en el fichero");

		listaCanciones = gf.leerFichero();
	}
}
