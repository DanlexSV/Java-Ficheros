import java.util.ArrayList;
import javax.swing.JOptionPane;

public class netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<series> listaSeries = new ArrayList<series>();
		
		for (int i = 0; i < 3; i++) {
			series ser = new series();
			ser.setNombreSerie(JOptionPane.showInputDialog("Escriba el nombre de una serie"));
			ser.setCap(Integer.parseInt(JOptionPane.showInputDialog("Escriba el capitulo actual")));
			ser.setTemp(Integer.parseInt(JOptionPane.showInputDialog("Escriba la temporada actual")));
			listaSeries.add(ser);
		}
		for (series milista:listaSeries)
			JOptionPane.showMessageDialog(null, milista.getNombreSerie() + ": " + milista.getTemp() + ", " + milista.getCap());
	}

}
