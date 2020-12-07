package Modelo;

public class Modelo {
	private GestionPeliculas GestorPelis;
	private GestionLogin GestorLogin;
	
	public Modelo()
	{
		GestorLogin = new GestionLogin();
	}
	
	public GestionPeliculas getGestorPelis() {
		return GestorPelis;
	}

	public GestionLogin getGestorLogin() {
		return GestorLogin;
	}
	
	
}
