import javax.swing.JOptionPane;

public class Pesos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona paciente = new Persona();
		paciente.setNombre(JOptionPane.showInputDialog("Escribe el nombre"));
		paciente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Escribe la altura en metros")));
		paciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad")));
		paciente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso en kg")));
		paciente.setSexo('M');
		
		JOptionPane.showMessageDialog(null, paciente.toString());
	}

}
