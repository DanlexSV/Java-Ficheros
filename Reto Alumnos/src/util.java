import java.util.ArrayList;
import javax.swing.JOptionPane;

public class util {
	
	public void Printar(ArrayList<alumno> misnotas) {
		String texto = "";
		for (alumno notas: misnotas)
			texto += notas + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}
	
}
