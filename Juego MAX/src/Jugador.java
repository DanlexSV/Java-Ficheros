import javax.swing.JOptionPane;

public class Jugador {
	/* Atributos */
	private String Nick, pwd;
	private int puntos;
	
	/* Constructor */
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* Getters & Setters */
	public String getNick() {
		return Nick;
	}

	public void setNick(String nick) {
		Nick = nick;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void altaJugador() {
		Nick = JOptionPane.showInputDialog("Escribe tu Nickname");
		pwd = JOptionPane.showInputDialog("Escribe tu contraseña de usuario");
		puntos = 0;
	}
	public void listar() {
		JOptionPane.showMessageDialog(null, Nick + ", " + pwd + ", " + puntos);
	}
}
