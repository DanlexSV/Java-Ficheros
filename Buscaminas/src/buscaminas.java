
import java.util.Random;

import javax.swing.JOptionPane;

public class buscaminas {
	/* Atributos */
	public int[][] minas;
	public int unos;

	/* Constructor */
	public buscaminas() {
		super();
		// TODO Auto-generated constructor stub
		minas = new int[5][5];
		unos = 0;
	}

	/* Metodos */
	public void iniciarminas() {
		Random r = new Random();
		for (int fil = 0; fil < minas.length; fil++)
			for (int col = 0; col < minas[fil].length; col++) {
				minas[fil][col] = r.nextInt(2);
				if (minas[fil][col] == 1)
					unos++;
			}
	}
	public void buscarminas() {
		if (unos > 0) {
			int fil = 0, col = 0;
			fil = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre el 0 y 4 para la fila"));
			col = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre el 0 y 4 para la columna"));
			if (minas[fil][col] == 1) {
				JOptionPane.showMessageDialog(null, "Has acertado つ ◕_◕ つ" + "\n" + "Quedan " + unos + " minas");
				minas[fil][col] = 0;
				unos--;
			}
			else 
				JOptionPane.showMessageDialog(null, "No has acertado ¬_¬");
		}
		else
			JOptionPane.showMessageDialog(null, "Ya no quedan minas");
	}
}
