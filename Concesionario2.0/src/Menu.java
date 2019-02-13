import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Menu 
{
	public static void main (String [] args) 
	{
		//ImageIcon image = new ImageIcon("camaro2.jpg");
		//JOptionPane.showMessageDialog(null, "Camaro SS 2018", "Concesionario", JOptionPane.INFORMATION_MESSAGE, image);
		
		
		Scanner sc = new Scanner (System.in);	
		
		Carro carro = new Carro();
		
		String [] Chevrolet = new String [10];
		String [] Hyundai = new String [10];
		String [] Ford = new String [10];
		
		int op = 0;
		
		do {
			int contadorChev = 0;
			int contadorHyn = 0;
			int contadorFord = 0;
			
			ImageIcon imagen = new ImageIcon(Menu.class.getResource("A&A.png"));
			JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imagen);
			ImageIcon imagen2 = new ImageIcon(Menu.class.getResource("A&A2.png"));
			op = Integer.parseInt((String) JOptionPane.showInputDialog (null, "Bienvenido al asistente contable de su concesionario.\n"
					+ "Marque (1) para añadir un carro al inventario\n"
					+ "Marque (2) para vender un carro\n"
					+ "Marque (3) para ver el historial de ventas\n"
					+ "Marque (0) para salir", "A&A", JOptionPane.INFORMATION_MESSAGE, imagen2, null, "") );
			
			switch (op) 
			{
							
			case 1:
				
				String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del carro \n(Tenga en cuenta que solo puede elegir entre las marcas\n"
						+ " Ford, Chevrolet y Hyundai)","A&A", JOptionPane.PLAIN_MESSAGE);
				
				if(marca.equalsIgnoreCase("Ford")) 
				{
					ImageIcon imgford = new ImageIcon(Menu.class.getResource("ford.png"));
					JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imgford);
				}
				else if (marca.equalsIgnoreCase("Chevrolet")) 
				{
					ImageIcon imgford = new ImageIcon(Menu.class.getResource("chevrolet.png"));
					JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imgford);
				}
				else if (marca.equalsIgnoreCase("Hyundai")) 
				{
					ImageIcon imgford = new ImageIcon(Menu.class.getResource("hyundai.png"));
					JOptionPane.showMessageDialog(null, null, "Concesionario A&A", JOptionPane.INFORMATION_MESSAGE, imgford);
				}
				
				String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del carro", "A&A", JOptionPane.PLAIN_MESSAGE);
				String matricula = JOptionPane.showInputDialog(null, "Ingrese la Matricula del carro","A&A", JOptionPane.PLAIN_MESSAGE);
				
				if(marca.equalsIgnoreCase("Ford")) 
				{
					Ford [contadorFord] = ("Auto: " + marca + ", Modelo " + modelo + " de Matricula: " + matricula);
					contadorFord += 1;
					JOptionPane.showInputDialog(null, "Auto: " + marca + ", Modelo " + modelo + " de Matricula: " + matricula, "A&A", JOptionPane.PLAIN_MESSAGE);
				}
				else if(marca.equalsIgnoreCase("Chevrolet")) 
				{
					Chevrolet [contadorChev] = ("Auto: " + marca + ", Modelo " + modelo + " de Matricula: " + matricula);
					contadorChev += 1;
					JOptionPane.showInputDialog(null, "Auto: " + marca + ", Modelo " + modelo + " de Matricula: " + matricula, "A&A", JOptionPane.PLAIN_MESSAGE);
				}
				else if (marca.equals("Hyundai")) 
				{
					Hyundai [contadorHyn] = ("Auto: " + marca + ", modelo " + modelo + " de matricula: " + matricula);
					contadorHyn += 1;
					JOptionPane.showInputDialog(null, "Auto: " + marca + ", modelo " + modelo + " de matricula: " + matricula, "A&A", JOptionPane.PLAIN_MESSAGE);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "La marca ingresada no existe\n o no puede ser agregada,\nFallo al ingresar los datos!", "A&A", JOptionPane.ERROR_MESSAGE);
				}
				
				break;
				
			case 2:

				break;
				
			case 3:
				
				break;
				
			case 0:
				break;
			}
			
		}while (op != 0);

	}
}
