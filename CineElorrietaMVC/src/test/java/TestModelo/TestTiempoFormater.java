package TestModelo;

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.TiempoFormater;

public class TestTiempoFormater {
	private TiempoFormater TF = new TiempoFormater();
	
	@Test
	public void testMinustosAStringMenos60() {
		assertEquals("0:55", TF.MinutosAString(55));
	}
	
	@Test
	public void testMinustosAStringMas60() {
		assertEquals("1:05", TF.MinutosAString(65));
	}

}
