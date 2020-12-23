package TestModelo;

import org.junit.Test;

import Modelo.Pelicula;

import static org.junit.Assert.*;

public class TestPelicula {
	private Pelicula Peli1 = new Pelicula(1,1,"'Prueba1'",300);
	private Pelicula Peli2 = new Pelicula("1;2;'Prueba2';300");
	
	@Test
	public void testGetGenero() 
	{
		assertEquals(1, Peli1.getCodigoGenero());
	}
	
	@Test
	public void testSetGenero() 
	{
		Peli1.setCodigoGenero(2);
		assertEquals(2, Peli1.getCodigoGenero());
	}
	
	@Test
	public void testGetCodigoPeli() 
	{
		assertEquals(1, Peli1.getCodigoGenero());
	}
	
	@Test
	public void testSetCodigoPeli() 
	{
		Peli1.setCodigoPeli(3);
		assertEquals(3, Peli1.getCodigoPeli());
	}
	
	@Test
	public void testGetNombre() 
	{
		assertEquals("'Prueba1'", Peli1.getNombre());
	}
	
	@Test
	public void testSetNombre() 
	{
		Peli1.setNombre("Fantastica peli");
		assertEquals("'Fantastica peli'", Peli1.getNombre());
	}
	
	@Test
	public void testGetMinutosDuracion() 
	{
		assertEquals(300, Peli1.getMinutosDuracion());
	}
	
	@Test
	public void testSetMinutosDuracion() 
	{
		Peli1.setMinutosDuracion(400);
		assertEquals(400, Peli1.getMinutosDuracion());
	}
	
	@Test
	public void testToString() 
	{
		assertEquals("1;1;'Prueba1';300", Peli1.toString());
	}
	
	@Test
	public void testConstructorString() 
	{
		assertEquals(1, Peli2.getCodigoGenero());
		assertEquals(2, Peli2.getCodigoPeli());
		assertEquals("'Prueba2'", Peli2.getNombre());
		assertEquals(300, Peli2.getMinutosDuracion());
	}
	
}
