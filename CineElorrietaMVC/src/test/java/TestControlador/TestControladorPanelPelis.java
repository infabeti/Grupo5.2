package TestControlador;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorPanelPelis;
import Modelo.ArrayExtendible;
import Modelo.GestionPeliculas;
import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelPelis;
import Vista.Vista;

public class TestControladorPanelPelis {
	private ControladorPanelPelis controladorPelis;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);
	private GestionPeliculas GP;

	private PanelPelis panelPelisMock = mock(PanelPelis.class);
	private ControladorPanelPelis spyControladorPelis = spy(
			new ControladorPanelPelis(modeloMock, vistaMock, controladorMock));

	@Test
	public void mostrarPanelPelis() {
		doReturn(panelPelisMock).when(spyControladorPelis).makePanelPelis(any(ControladorPanelPelis.class));

		controladorPelis.mostrarPanelPelis(1);
		verify(vistaMock, times(1)).mostrarPanel(panelPelisMock);
		verify(controladorPelis, times(1)).GetPelis();
		verify(controladorPelis, times(1)).MostrarPelis();
	}

	@Test
	public void accionadoBottonVolverPanelPelis() {
		controladorPelis = new ControladorPanelPelis(modeloMock, vistaMock, controladorMock);

		controladorPelis.accionadoBottonVolverPanelPelis();

		verify(controladorMock, times(1)).navegarPanelGeneros();
	}
	
	
	@Test
	public void accionadoBottonAceptarPanelPelis() {
		controladorPelis = new ControladorPanelPelis(modeloMock, vistaMock, controladorMock);

		spyControladorPelis.accionadoBottonAceptarPanelPelis();
	}
	
	@Test
	public void testMostrarPelis() {
		controladorPelis = new ControladorPanelPelis(modeloMock, vistaMock, controladorMock);

		controladorPelis.MostrarPelis();

		verify(controladorPelis, times(1)).MostrarPelis();
	}

}
