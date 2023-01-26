import javax.swing.JOptionPane;

public class juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		buscaminas m = new buscaminas();
		String opt = JOptionPane.showInputDialog("i ~ crear las minas" + "\n" + 
				"j ~ iniciar el juego" + "\n" + "s ~ Salir" + "\n" + 
				"Escoja una de las opciones").toLowerCase();
		while (!opt.equals("s")) {
			switch(opt) {
			case "i": m.iniciarminas(); break;
			case "j": m.buscarminas(); break;
			default: JOptionPane.showMessageDialog(null, "Opcion invalida, intentalo de nuevo");
			}
			opt = JOptionPane.showInputDialog("i ~ crear las minas" + "\n" + 
					"j ~ iniciar el juego" + "\n" + "s ~ Salir" + "\n" + 
					"Escoja una de las opciones").toLowerCase();
		}
	}

}
