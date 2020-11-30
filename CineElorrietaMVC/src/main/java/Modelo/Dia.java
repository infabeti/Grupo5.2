package Modelo;

import java.util.ArrayList;


public class Dia {
	private int MinutosProyeccion;
	private ArrayExtendible<Pelicula> PelisHoy;
	
	Dia(int iMaxMins)
	{
		PelisHoy = new ArrayExtendible<Pelicula>();
		MinutosProyeccion = iMaxMins;
	}
	
	public void AnadirPelicula(Pelicula inPeli)
	{
		PelisHoy.Anadir(inPeli);
	}
	
	public int MinutosRestantes()
	{
		int minutosOcupados=0;
		for(int i=0;i<PelisHoy.getTamanio();i++)
		{
			minutosOcupados+= PelisHoy.Recoger(i).getMinutosDuracion();
		}
		return MinutosProyeccion-minutosOcupados;
	}
	
	public boolean CabePeli(int iMinutosDuracion)
	{
		if(iMinutosDuracion>this.MinutosRestantes())
			return false;
		else
			return true;
	}
	
	public ArrayExtendible<Integer> GetGenerosHoy()
	{
		ArrayExtendible<Integer> ListaGeneros = new ArrayExtendible<Integer>();
		
		for(int i=0;i<PelisHoy.getTamanio();i++)
		{
			ListaGeneros.Anadir(PelisHoy.Recoger(i).getCodigoGenero());
		}
		
		return ListaGeneros;
	}
	
	public ArrayExtendible<Pelicula> getPelisHoy()
	{
		return PelisHoy;	
	}
}
