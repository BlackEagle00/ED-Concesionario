package concesionario;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
	
	static int contadorChev = 0;
	static int contadorHyn = 0;
	static int contadorFord = 0;
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);	
		
		Carro carro = new Carro();
		
		String [] Chevrolet = new String [10];
		String [] Hyundai = new String [10];
		String [] Ford = new String [10];
		String [] TotalVentas = new String [30];
		
		int op = 0;
		
		do {
			
			ImageIcon imagen = new ImageIcon(("A&A.png"));
			JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imagen);
			ImageIcon imagen2 = new ImageIcon(("A&A2.png"));
			op = Integer.parseInt((String) JOptionPane.showInputDialog (null, "Bienveido a su asistente contable de su concesionario.\n"
					+ "Marque (1) para añadir una carro al inventario\n"
					+ "Marque (2) para vender un carro\n"
					+ "Marque (3) para ver el historial de ventas\n"
					+ "Marque (0) para salir", "A&A", JOptionPane.INFORMATION_MESSAGE, imagen2, null, ""));
			
			switch (op) {
							
			case 1:
				
				String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del carro \n(Tenga en cuenta que solo puede elejir entre las marcas\n"
						+ " Ford, Chevrolet y Hyundai)","A&A", JOptionPane.PLAIN_MESSAGE);
				
				if(marca.equalsIgnoreCase("Ford")) 
				{
					ImageIcon imgford = new ImageIcon(("ford.png"));
					JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imgford);
				}
				else if (marca.equalsIgnoreCase("Chevrolet")) 
				{
					ImageIcon imgchev = new ImageIcon(("chevrolet.png"));
					JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imgchev);
				}
				else if (marca.equalsIgnoreCase("Hyundai")) 
				{
					ImageIcon imghyun = new ImageIcon(("hyundai.png"));
					JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imghyun);
				}
				
				String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro","A&A", JOptionPane.PLAIN_MESSAGE);
				String matricula = JOptionPane.showInputDialog(null, "Ingrese la Matricula del carro","A&A", JOptionPane.PLAIN_MESSAGE);
				
				if(marca.equalsIgnoreCase("Ford")) {
					Ford = carro.AgregarInv(marca, modelo, matricula, contadorFord);
					contadorFord += 1;
				}else if(marca.equalsIgnoreCase("Chevrolet")) {
					Chevrolet = carro.AgregarInv(marca, modelo, matricula, contadorChev);
					contadorChev += 1;
				}else if (marca.equals("Hyundai")) {
					Hyundai = carro.AgregarInv(marca, modelo, matricula, contadorHyn);
					contadorHyn += 1;
				}else {
					JOptionPane.showMessageDialog(null, "La marca ingresada no existe\n o no puede ser agregada,\nFallo al ingresar los datos!", "A&A", JOptionPane.ERROR_MESSAGE);
				}
				
				break;
				
			case 2:
				
				String carrosDisp = "";
				
				int opcionMarca = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la marca del carro que desea vender:\n"
						+ "Marque (1) para comprar un Ford\n"
						+ "Marque (2) para comprar un Hyundai\n"
						+ "Marque (3) para compar un Chevrolet\n"));
				
				if (opcionMarca == 1) {
					
					carrosDisp = carro.carrosDisponibles(Ford);
					int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carro que desea vender\n" + carrosDisp));
					
					TotalVentas = carro.VenderAuto(index, Ford);
					Ford = carro.EliminarInv(Ford, index);
				}else if(opcionMarca == 2) {
					
					carrosDisp = carro.carrosDisponibles(Hyundai);
					int index = Integer.parseInt(JOptionPane.showInputDialog(carrosDisp));
					
					TotalVentas = carro.VenderAuto(index, Hyundai);
					Hyundai = carro.EliminarInv(Hyundai, index);
					
				}else if (opcionMarca == 3){
					
					carrosDisp = carro.carrosDisponibles(Chevrolet);
					int index = Integer.parseInt(JOptionPane.showInputDialog(carrosDisp));
					
					TotalVentas = carro.VenderAuto(index, Chevrolet);
					Chevrolet = carro.EliminarInv(Chevrolet, index);
					
				}else {
					JOptionPane.showMessageDialog(null, "La opcion ingresada no es valida", "A&A", JOptionPane.WARNING_MESSAGE);
					break;
				}
	
				break;
				
			case 3:
				
				int casillasVenta = 0;
				for (int i = 0; i < TotalVentas.length; i++) {
					if (TotalVentas [i] != null) {
						casillasVenta += 1;
					}
				}

				String aviso = "";
				
				for (int j = 0; j < casillasVenta; j++) {
					aviso += j + ". " + TotalVentas [j] + "\n";
					}
				
				JOptionPane.showMessageDialog(null, aviso);
					
					break;
				
				case 0:
					break;
				
				}
			
				
				
			
		}while (op != 0);
		
	}
		
}