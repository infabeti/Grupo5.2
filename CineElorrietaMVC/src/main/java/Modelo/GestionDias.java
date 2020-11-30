package Modelo;

public class GestionDias {
	private Dia[] ListaDias;
	
	public GestionDias()
	{
		ListaDias = new Dia[2];
		this.GenerarNuevosDias();
	}
	
	public void GenerarNuevosDias()
	{
		ListaDias[0] = new Dia(480);
		ListaDias[1] = new Dia(360);
	}
	
	public void AnadirPelicula(Pelicula inPeli,int dia)
	{
		if(ListaDias[dia].CabePeli(inPeli.getMinutosDuracion()))
		{
			ListaDias[dia].AnadirPelicula(inPeli);
		}
		else
		{
			if(dia==0)
			{
				if(ListaDias[1].CabePeli(inPeli.getMinutosDuracion()))
				{
					ListaDias[1].AnadirPelicula(inPeli);
				}
			}
			else
			{
				if(ListaDias[0].CabePeli(inPeli.getMinutosDuracion()))
				{
					ListaDias[0].AnadirPelicula(inPeli);
				}
			}
		}
	}
	
	public Dia getDia(int iDia)
	{
		return ListaDias[iDia];
	}
	
}
