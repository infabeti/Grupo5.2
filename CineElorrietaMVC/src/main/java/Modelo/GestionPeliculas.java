package Modelo;

import java.io.IOException;

public class GestionPeliculas {
	private ArrayExtendible<Pelicula> Peliculas;
	private LeerPeliculas LP;
	
	GestionPeliculas()
	{
		LP = new LeerPeliculas();
		this.CargarPelis();
	}
	
	public void CargarPelis()
	{
		try {
			Peliculas = LP.LeerPeliculasDeArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayExtendible<Pelicula> GetPelisPorGenero(int igenero)
	{
		ArrayExtendible<Pelicula> PelisGenero = new ArrayExtendible<Pelicula>();
		for(int i=0;i<Peliculas.getTamanio();i++)
		{
			if(Peliculas.Recoger(i).getCodigoGenero()==igenero)
				PelisGenero.Anadir(Peliculas.Recoger(i));
		}
		return PelisGenero;
	}
	
	public Pelicula GetPeliPorCodigo(int icodigo)
	{
		for(int i=0;i<Peliculas.getTamanio();i++)
		{
			if(Peliculas.Recoger(i).getCodigoGenero()==icodigo)
				return Peliculas.Recoger(i);
		}
		//si no encontramos peli devolvemos un null
		return null;
	}
}
