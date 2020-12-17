package TestControlador;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorPanelResumen;
import Modelo.Modelo;
import Vista.PanelResumen;
import Vista.Vista;

public class TestControladorPanelResumen {
	
	private ControladorPanelResumen controladorResumen;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);

	private PanelResumen panelResumenMock = mock(PanelResumen.class);
	private ControladorPanelResumen spyControladorResumen = spy(
			new ControladorPanelResumen(modeloMock, vistaMock, controladorMock));

	@Test
	public void mostrarPanelResumen() {
		doReturn(panelResumenMock).when(spyControladorResumen).makePanelResumen(any(ControladorPanelResumen.class));
		Modelo modelo = new Modelo();
		spyControladorResumen.mostrarPanelResumen();
		verify(vistaMock, times(1)).mostrarPanel(panelResumenMock);
	}

	@Test
	public void accionadoBottonVolverPanelResumen() {
		controladorResumen = new ControladorPanelResumen(modeloMock, vistaMock, controladorMock);

		controladorResumen.accionadoBottonVolverPanelResumen();

		verify(controladorMock, times(1)).navegarPanelGeneros();
	}
	
	@Test
	public void accionadoBottonAceptarPanelResumen() {
		controladorResumen = new ControladorPanelResumen(modeloMock, vistaMock, controladorMock);

		controladorResumen.accionadoBottonAceptarPanelResumen();

		verify(controladorMock, times(1)).navegarPanelFin();
	}

}
