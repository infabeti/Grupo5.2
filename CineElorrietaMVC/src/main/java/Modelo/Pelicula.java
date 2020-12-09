package Modelo;

public class Pelicula {
	private int codigoGenero;
	private int codigoPeli;
	private String Nombre;
	private int minutosDuracion;
	
	public Pelicula(int codigoGenero, int codigoPeli, String nombre, int minutosDuracion) {
		this.codigoGenero = codigoGenero;
		this.codigoPeli = codigoPeli;
		this.Nombre = nombre;
		this.minutosDuracion = minutosDuracion;
	}
	
	public Pelicula (String PeliEnTexto)
	{
		String[] datos = PeliEnTexto.split("\\;");
		this.codigoGenero = Integer.parseInt(datos[0]);
		this.codigoPeli = Integer.parseInt(datos[1]);
		this.Nombre = datos[2];
		this.minutosDuracion = Integer.parseInt(datos[3]);
	}

	public int getCodigoGenero() {
		return codigoGenero;
	}

	public void setCodigoGenero(int codigoGenero) {
		this.codigoGenero = codigoGenero;
	}

	public int getCodigoPeli() {
		return codigoPeli;
	}

	public void setCodigoPeli(int codigoPeli) {
		this.codigoPeli = codigoPeli;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getMinutosDuracion() {
		return minutosDuracion;
	}

	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}

	@Override
	public String toString() {
		return codigoGenero + "*" + codigoPeli + "*" + Nombre
				+ "*" + minutosDuracion;
	}
}
