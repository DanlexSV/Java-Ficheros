import java.util.ArrayList;
import javax.swing.JOptionPane;

public class util {
	gestionFichero g;

	public void printar(ArrayList<alumno> misnotas) {
		String texto = "";
		for (alumno notas : misnotas)
			texto += notas + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}

	public boolean borrar(ArrayList<alumno> misnotas, alumno a) {
		boolean haBorrado = true;
		try {
			misnotas.clear();
			g.leer();
			for (int i = 0; i < misnotas.size(); i++) {
				if (misnotas.get(i).equals(a))
					misnotas.remove(i);
				else
					JOptionPane.showMessageDialog(null, "No existe el DNI solicitado つ ◕_◕ つ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			haBorrado = false;
		}
		return haBorrado;
	}

	public boolean modificar(ArrayList<alumno> misnotas, alumno a) {
		boolean haModificado = true;
		try {
			misnotas.clear();
			g.leer();
			for (int i = 0; i < misnotas.size(); i++) {
				if (misnotas.get(i).equals(a)) {
					misnotas.remove(i);
					g.escribir(a);
				} else 
					JOptionPane.showMessageDialog(null, "No existe el DNI solicitado つ ◕_◕ つ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			return haModificado = false;
		}
		return haModificado;
	}
	
	public void consultar(ArrayList<alumno> misnotas, alumno a) {
		misnotas.clear();
		g.leer();
		for (int i = 0; i < misnotas.size(); i++) {
			if (misnotas.get(i).equals(a)) {
				JOptionPane.showMessageDialog(null, a);
			} else
				JOptionPane.showMessageDialog(null, "No existe el Modulo solicitado つ ◕_◕ つ");
		}
	}
}
