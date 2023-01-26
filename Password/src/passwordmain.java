import javax.swing.JOptionPane;

public class passwordmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contraseña;
		password p = new password();
		
		contraseña = JOptionPane.showInputDialog("Escriba una contraseña: ");
		
		p.crearContraseña(contraseña);
		
		if (!p.esFuerte())
			JOptionPane.showMessageDialog(null, "La contraseña no es fuerte");
		else 
			JOptionPane.showMessageDialog(null, "Contraseña guardada");
	}

}
