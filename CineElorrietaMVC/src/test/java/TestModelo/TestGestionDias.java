package TestModelo;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.Dia;
import Modelo.GestionDias;
import Modelo.Pelicula;

public class TestGestionDias {
	private GestionDias GD = new GestionDias();
	private Pelicula Peli = new Pelicula(1,1,"La fantabulosa aventura", 30);
	private Pelicula Peli2 = new Pelicula(2,1,"La fantabulosa aventura 2: battle Tendency", 9999);
	private Dia DiaPrueba = new Dia(480);
	
	@Test
	public void testSetDia() {
		GD.SetDia(2);
		assertEquals(2, GD.GetSelectedDia());
	}
	
	@Test
	public void testAnadirPelicula() {
		assertEquals(0, GD.AnadirPelicula(Peli));
	}
	
	@Test
	public void testAnadirPeliculaMismoGeneroMismoDiaSabado() {
		GD.AnadirPelicula(Peli);
		assertEquals(2, GD.AnadirPelicula(Peli));
	}
	
	@Test
	public void testAnadirPeliculaMismoGeneroMismoDiaSabadoDomingo() {
		GD.SetDia(1);
		GD.AnadirPelicula(Peli);
		assertEquals(2, GD.AnadirPelicula(Peli));
	}
	
	@Test
	public void testAnadirPeliculaMismoGeneroEnDosDiasSabado() {
		GD.SetDia(1);
		GD.AnadirPelicula(Peli);
		GD.SetDia(0);
		GD.AnadirPelicula(Peli);
		assertEquals(1, GD.AnadirPelicula(Peli));
	}
	
	@Test
	public void testAnadirPeliculaMismoGeneroEnDosDiasDomingo() {
		GD.SetDia(0);
		GD.AnadirPelicula(Peli);
		GD.SetDia(1);
		GD.AnadirPelicula(Peli);
		assertEquals(1, GD.AnadirPelicula(Peli));
	}
	
	@Test
	public void testAnadirPeliculaSinTiempoEnDosDias() {
		assertEquals(3, GD.AnadirPelicula(Peli2));
	}
	
	@Test
	public void testGetDia() {
		assertEquals(DiaPrueba.getClass(), GD.getDia(0).getClass());
	}
}
