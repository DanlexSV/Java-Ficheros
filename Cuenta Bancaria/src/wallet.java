import javax.swing.JOptionPane;

public class wallet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opt = JOptionPane.showInputDialog("I ~ Ingresar dinero a la cuenta" + "\n" + 
				"R ~ Retirar dinero de la cuenta" + "\n" + "L ~ Listar cantidad actual en la cuenta" 
				+ "\n" + "Escribe una de las opciones").toUpperCase();
		String name = JOptionPane.showInputDialog("Escriba su nombre para operar");
		cuenta micuenta = new cuenta(name);
		while (!opt.equals("S")) {
			switch(opt) {
			case "I":
				double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Que cantidad quiere ingresar"));
				micuenta.ingresar(cantidad); break;
			case "R":
				double cantidad1 = Double.parseDouble(JOptionPane.showInputDialog("Que cantidad quiere retirar"));
				micuenta.retirar(cantidad1); break;
			case "L": micuenta.listar(); break;
			default:  
			}
			opt = JOptionPane.showInputDialog("I ~ Ingresar dinero a la cuenta" + "\n" + 
					"R ~ Retirar dinero de la cuenta" + "\n" + "L ~ Listar cantidad actual en la cuenta" 
					+ "\n" + "S ~ Salir" + "\n" + "Escribe una de las opciones").toUpperCase();
		}

	}

}
