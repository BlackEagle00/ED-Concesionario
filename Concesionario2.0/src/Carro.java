public class Carro 
{
	
	String marca, modelo,matricula;
	
	public String [] VenderAuto (String AutoVender) 
	{
		
		String [] ventas = new String [10];
		
		for (int i = 0; i < ventas.length; i++)
		{
			if(ventas [i] == null) 
			{
				ventas [i] = AutoVender;
			}
		}
		
		return ventas;
	}
	

}