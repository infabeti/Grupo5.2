package TestControlador;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorPanelGeneros;
import Modelo.Modelo;
import Vista.PanelGeneros;
import Vista.Vista;

public class TestControladorPanelGeneros {
	
	private ControladorPanelGeneros controladorGeneros;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);

	private PanelGeneros panelGenerosMock = mock(PanelGeneros.class);
	private ControladorPanelGeneros spyControladorGeneros = spy(
			new ControladorPanelGeneros(modeloMock, vistaMock, controladorMock));

	@Test
	public void mostrarPanelGeneros() {
		doReturn(panelGenerosMock).when(spyControladorGeneros).makePanelGeneros(any(ControladorPanelGeneros.class));

		spyControladorGeneros.mostrarPanelGeneros();
		verify(vistaMock, times(1)).mostrarPanel(panelGenerosMock);
	}

	@Test
	public void accionadoBottonVolverPanelGeneros() {
		controladorGeneros = new ControladorPanelGeneros(modeloMock, vistaMock, controladorMock);

		controladorGeneros.accionadoBottonVolverPanelGeneros();

		verify(controladorMock, times(1)).navegarPanelLogin();
	}
	
	@Test
	public void accionadoBottonAceptarPanelGeneros() {
		controladorGeneros = new ControladorPanelGeneros(modeloMock, vistaMock, controladorMock);

		controladorGeneros.accionadoBottonAceptarPanelGeneros();

		verify(controladorMock, times(1)).navegarPanelResumen();
	}
	
	@Test
	public void accionadoBottonGenroPanelGeneros() {
		controladorGeneros = new ControladorPanelGeneros(modeloMock, vistaMock, controladorMock);

		controladorGeneros.accionadoBottonAceptarPanelGeneros();

		verify(controladorMock, times(1)).navegarPanelPelis(1);
	}

}
