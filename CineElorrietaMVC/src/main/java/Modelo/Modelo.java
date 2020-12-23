package Modelo;

public class Modelo {
	private GestionPeliculas GestorPelis;
	private GestionLogin GestorLogin;
	private TiempoFormater TF;
	private GestionDias GD;
	
	public Modelo()
	{
		GestorLogin = new GestionLogin();
		GestorPelis = new GestionPeliculas();
		TF = new TiempoFormater();
		GD = new GestionDias();
	}
	
	public GestionPeliculas getGestorPelis() {
		return GestorPelis;
	}

	public GestionLogin getGestorLogin() {
		return GestorLogin;
	}
	
	public GestionDias getGestionDias() {
		return GD;
	}
	
	public String formatearTiempoString(int minutos)
	{
		return TF.MinutosAString(minutos);
	}
}
