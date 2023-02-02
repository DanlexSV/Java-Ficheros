import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestionFichero {

	private String nombreFichero;

	public GestionFichero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GestionFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	public void escribirFichero(Jugador jugador) {
		try {
			FileWriter fw = new FileWriter(nombreFichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(jugador.getNick() + " - " + jugador.getPwd() + " - " + jugador.getPuntos() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<Jugador> leerFichero() {
		ArrayList<Jugador> newGame = new ArrayList<Jugador>();
		String linea = "";
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				String aux[] = linea.split(" - ");
				Jugador jugador = new Jugador();
				jugador.setNick(aux[0]);
				jugador.setPwd(aux[1]);
				jugador.setPuntos(Integer.parseInt(aux[2]));
				newGame.add(jugador);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return newGame;
	}

	public void ModificarPuntos() {
		int puntos;
		ArrayList<Jugador> contenidoFichero = new ArrayList<Jugador>();
		contenidoFichero = leerFichero();
		File f = new File(nombreFichero);
		f.delete();
		String Nick = JOptionPane.showInputDialog("Escirba el nickname a buscar");
		for (int i = 0; i < contenidoFichero.size(); i++) {
			if (contenidoFichero.get(i).getNick().equals(Nick)) {
				puntos = contenidoFichero.get(i).getPuntos();
				puntos += 5;
				contenidoFichero.get(i).setPuntos(puntos);
			}
			escribirFichero(contenidoFichero.get(i));
		}
	}
	public void BorrarJugador() {
		ArrayList<Jugador> contenidoFichero = new ArrayList<Jugador>();
		contenidoFichero = leerFichero();
		File f = new File(nombreFichero);
		f.delete();
		String Nick = JOptionPane.showInputDialog("Escriba el nickname para borrar");
		/*for (Jugador jogo: contenidoFichero) {
			if (!jogo.getNick().equals(Nick))
				escribirFichero(jogo);
			else
				JOptionPane.showMessageDialog(null, "El fichero no existe");
		}*/
		for (int i = 0; i < contenidoFichero.size(); i++)
			if (contenidoFichero.get(i).equals(Nick)) {
				contenidoFichero.remove(i);
				i--;
			}
	}
}
