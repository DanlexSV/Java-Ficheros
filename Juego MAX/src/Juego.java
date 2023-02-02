import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op = JOptionPane.showInputDialog("Escoja una de las siguientes opciones..." + "\n"
				+ "A ~ Alta de un nuevo jugador" + "\n" + "B ~ Borrar un jugador" + "\n"
				+ "M ~ Modificar los puntos de un jugador" + "\n" + "L ~ Listar un jugador" + "\n" + "S ~ Salir")
				.toUpperCase();
		GestionFichero gf = new GestionFichero(JOptionPane.showInputDialog("Escribe el nombre del fichero"));
		while (!op.equals("S")) {
			switch (op) {
			case "A":
				Jugador jugador = new Jugador();
				jugador.altaJugador();
				gf.escribirFichero(jugador);
				break;
			case "L":
				ArrayList<Jugador> contenido = new ArrayList<Jugador>();
				contenido = gf.leerFichero();
				utilidades util = new utilidades();
				util.listado(contenido);
				break;
			case "M":
				gf.ModificarPuntos();
				break;
			case "B":
				gf.BorrarJugador();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
			}
			op = JOptionPane.showInputDialog("Escoja una de las siguientes opciones..." + "\n"
					+ "A ~ Alta de un nuevo jugador" + "\n" + "B ~ Borrar un jugador" + "\n"
					+ "M ~ Modificar los puntos de un jugador" + "\n" + "L ~ Listar un jugador" + "\n" + "S ~ Salir")
					.toUpperCase();
		}

	}

}
