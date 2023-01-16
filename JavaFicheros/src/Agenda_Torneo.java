import java.io.*;
import javax.swing.*;
import java.util.*;

public class Agenda_Torneo {
	
	static ArrayList<String>Lista = new ArrayList<String>();
	static ArrayList<String>Chequeo = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcion = JOptionPane.showInputDialog("R ~ Registrar los equipos" + "\n" +
				"G ~ Grabar los datos" + "\n" + "L ~ Listar los equipos" + "\n" + 
				"E ~ Eliminar un equipo" + "\n" + "M ~ Modificar un equipo" + "\n" +
				"S ~ Salir" + "\n" + "Escriba una opcion").toUpperCase();
		
		while (!opcion.equals("S")) {
			switch (opcion) {
			case "R": registro(); break;
			case "G": grabar(); break;
			case "L": 
			case "E": 
			case "M": 
			default: JOptionPane.showMessageDialog(null, "Opcion incorrecta"); break;
			}
		}
	}
	private static void registro() {
		String equipo = JOptionPane.showInputDialog("Escribe el nombre de tu equipo");
		String capitan = JOptionPane.showInputDialog("Escribe el nombre del capitan del equipo");
		String jugador = JOptionPane.showInputDialog("Escribe la cantidad de miembros");
		Lista.add(equipo + ": " + capitan + ", " + jugador);
	}
	private static void grabar() {
		if (Lista.size() > 0) {
			for (String equipo:Lista)
				saveFichero(equipo);
			Lista.clear();
		} else
			JOptionPane.showMessageDialog(null, "No esta registrado ese equipo");
	}
	private static void saveFichero(String equipo) {
		try {
			FileWriter fw = new FileWriter("Listado.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(equipo + "\n");
			bw.close();
			fw.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
