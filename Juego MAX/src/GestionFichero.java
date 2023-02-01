import java.io.*;
import java.util.ArrayList;

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
			FileWriter fw = new FileWriter(nombreFichero);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(jugador.getNick() + " - " + jugador.getPwd() + " - " + jugador.getPuntos() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<Jugador> leerFichero(){
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

}
