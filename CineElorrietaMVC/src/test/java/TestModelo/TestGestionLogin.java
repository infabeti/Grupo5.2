package TestModelo;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.GestionLogin;

public class TestGestionLogin {
	private GestionLogin GL = new GestionLogin();
	
	@Test
	public void testErrorLogin() {
		assertEquals(0, GL.probarLogin("asadsd", "asdasdas".toCharArray()));
	}
	
	@Test
	public void testErrorLoginContrasena() {
		assertEquals(0, GL.probarLogin("admin", "asdasdas".toCharArray()));
	}
	
	@Test
	public void testLoginAdmin() {
		assertEquals(1, GL.probarLogin("admin", "nimda".toCharArray()));
	}
	
	@Test
	public void testLoginEditor() {
		assertEquals(2, GL.probarLogin("editor", "contra".toCharArray()));
	}
}
