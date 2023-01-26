import javax.swing.JOptionPane;

public class teatro {
	/* Atributo */
	private boolean[][] patioButacas;
	
	/* Constructor */
	public teatro() {
		super();
		// TODO Auto-generated constructor stub
		patioButacas = new boolean[10][10];
	}
	
	/* Metodos */
	public void ocuparButaca(int fila, int numeroButaca) {
		patioButacas[fila][numeroButaca] = true;
	}
	public boolean estaOcupado(int fila, int numeroButaca) {
		return patioButacas[fila][numeroButaca];
	}
	public void liberaButaca(int fila, int numeroButaca) {
		patioButacas[fila][numeroButaca] = false;
	}
	public void listarDisponibles() {
		for (int i = 0; i < patioButacas.length; i++) {
			JOptionPane.showMessageDialog(null, "|");
			for (int j = 0; j < patioButacas[0].length; j++) {
				JOptionPane.showMessageDialog(null, patioButacas[i][j]);
				if (j != patioButacas[0].length-1)
					JOptionPane.showMessageDialog(null, "\n");
			}
			JOptionPane.showMessageDialog(null, "|");
		}
	}
}
