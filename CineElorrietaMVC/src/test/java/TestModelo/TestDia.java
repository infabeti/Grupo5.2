package TestModelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Modelo.ArrayExtendible;
import Modelo.Dia;
import Modelo.Pelicula;

public class TestDia {
	private int MinutosProyeccion = 480;
	private ArrayExtendible<Pelicula> PelisHoy;
	private Dia dia = new Dia(MinutosProyeccion);

	@Test
	public void testAnadirPeliculas() {
		Pelicula peli = new Pelicula(1, 1, "Handia", 116);
		PelisHoy.Anadir(peli);
		assertEquals(PelisHoy.Recoger(0), peli);
	}

	@Test
	public void testMinutosRestantes() {
		assertEquals(dia.MinutosRestantes(), 480);
	}

	@Test
	public void testCabePeli() {
		int mins = 200;
		assertEquals(dia.CabePeli(mins), true);
		mins = 500;
		assertEquals(dia.CabePeli(mins), false);
	}
	
	@Test
	public void testGetGenerosHoy() {
		ArrayExtendible<Integer> pelis = new ArrayExtendible<Integer>();
		pelis.Anadir(1);
	}

}
