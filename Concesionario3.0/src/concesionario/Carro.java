package concesionario;

public class Carro {
	
	String marca, modelo,matricula;

	public String []  AgregarInv (String marca, String modelo, String matricula, int contador) {
		
		String [] Inv = new String [10];
		
		Inv [contador] = "Auto: " + marca + ", modelo " + modelo + " de matricula: " + matricula;
		
		return Inv ;
	}
	
	public String [] VenderAuto (int index, String [] Inv) {
		
		String [] ventas = new String [30];
		
		for (int i = 0; i < ventas.length; i++) {
			if(ventas [i] == null) {
				ventas [i] = Inv [index];
			}
		}
		
		return ventas;
	}
	
	public String [] EliminarInv (String [] Inv, int pos) {
		
		String [] nuevoInv = new String [10];
		
		nuevoInv = Inv;
		nuevoInv [pos] = "Auto Vendido";
		
		return nuevoInv;
		
	}
	
	public void MostrarVentas () {
		
	}

	public String carrosDisponibles (String [] inv) {
		String mensaje = "";
		for (int i = 0; i < inv.length; i++) {
			mensaje += "\n" + i + ". " + inv [i] + "\n ";
		}
		return mensaje;
	}
	

}