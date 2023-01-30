import java.util.ArrayList;
import javax.swing.JOptionPane;

public class util {
	
	public void printar(ArrayList<alumno> misnotas) {
		String texto = "";
		for (alumno notas: misnotas)
			texto += notas + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}
	public boolean borrar(ArrayList<alumno> misnotas, String DNI) {
		boolean haBorrado = true;
		try {
			String delete = JOptionPane.showInputDialog("Escriba el DNI del alumno que quiere eliminar");
			for (int i = 0; i < misnotas.size(); i++){
				if (misnotas.get(i).equals(delete))
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
}
