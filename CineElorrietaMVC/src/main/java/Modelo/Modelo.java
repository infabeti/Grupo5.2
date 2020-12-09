package Modelo;

public class Modelo {
	private GestionPeliculas GestorPelis;
	private GestionLogin GestorLogin;
	private TiempoFormater TF;
	
	public Modelo()
	{
		GestorLogin = new GestionLogin();
		GestorPelis = new GestionPeliculas();
		TF = new TiempoFormater();
	}
	
	public GestionPeliculas getGestorPelis() {
		return GestorPelis;
	}

	public GestionLogin getGestorLogin() {
		return GestorLogin;
	}
	
	public String formatearTiempoString(int minutos)
	{
		return TF.MinutosAString(minutos);
	}
}
