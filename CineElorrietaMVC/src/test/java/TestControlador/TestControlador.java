package TestControlador;

import static org.mockito.Mockito.*;

import org.junit.Test;

import Controlador.*;
import Modelo.*;
import Vista.*;

public class TestControlador {

	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador spyControlador;
	private ControladorPanelLogin controladorLoginMock = mock(ControladorPanelLogin.class);
	private ControladorPanelGeneros controladorGenerosMock = mock(ControladorPanelGeneros.class);
	private ControladorPanelPelis controladorPelisMock = mock(ControladorPanelPelis.class);
	private ControladorPanelResumen controladorResumenMock = mock(ControladorPanelResumen.class);
	private ControladorPanelFin controladorFinMock = mock(ControladorPanelFin.class);
	private ControladorLoger controladorLogMock = mock(ControladorLoger.class);

	@Test
	public void testNavegarPanelLogin() {
		spyControlador = spy(new Controlador(modeloMock, vistaMock));
		doReturn(controladorLoginMock).when(spyControlador).makeControladorLogin(any(Modelo.class), any(Vista.class),
				any(Controlador.class));

		spyControlador.navegarPanelLogin();
		verify(spyControlador, times(1)).navegarPanelLogin();
	}

	@Test
	public void testNavegarPanelGeneros() {
		spyControlador = spy(new Controlador(modeloMock, vistaMock));
		doReturn(controladorGenerosMock).when(spyControlador).makeControladorGeneros(any(Modelo.class),
				any(Vista.class), any(Controlador.class));

		spyControlador.navegarPanelGeneros();
		verify(spyControlador, times(1)).navegarPanelGeneros();
	}

	@Test
	public void testNavegarPanelPelis() {
		spyControlador = spy(new Controlador(modeloMock, vistaMock));
		doReturn(controladorPelisMock).when(spyControlador).makeControladorPeliculas(any(Modelo.class),
				any(Vista.class), any(Controlador.class));

		spyControlador.navegarPanelPelis(2);
		verify(spyControlador, times(1)).navegarPanelPelis(2);
	}

	@Test
	public void testNavegarPanelResumen() {
		spyControlador = spy(new Controlador(modeloMock, vistaMock));
		doReturn(controladorResumenMock).when(spyControlador).makeControladorResumen(any(Modelo.class),
				any(Vista.class), any(Controlador.class));

		spyControlador.navegarPanelResumen();
		verify(spyControlador, times(1)).navegarPanelResumen();
	}

	@Test
	public void navegarPanelFin() {
		spyControlador = spy(new Controlador(modeloMock, vistaMock));
		doReturn(controladorFinMock).when(spyControlador).makeControladorFin(any(Modelo.class),
				any(Vista.class), any(Controlador.class));

		spyControlador.navegarPanelFin();
		verify(spyControlador, times(1)).navegarPanelFin();
	}
	
	@Test
	public void logearErrorUsuario() {
		String nombre = "pepe";
		String descripcion = "Error al iniciar sesion";
		spyControlador = spy(new Controlador(modeloMock, vistaMock));
		doReturn(controladorLogMock).when(spyControlador).makeControladorLoger();
		
		spyControlador.LogearErrorUsuario(nombre, descripcion);
		verify(spyControlador, times(1)).LogearErrorUsuario(nombre, descripcion);
	}

}
