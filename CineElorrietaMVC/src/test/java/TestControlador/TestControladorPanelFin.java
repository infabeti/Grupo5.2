package TestControlador;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorPanelFin;
import Modelo.Modelo;
import Vista.PanelFin;
import Vista.Vista;

public class TestControladorPanelFin {

	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);

	private PanelFin panelFinMock = mock(PanelFin.class);
	private ControladorPanelFin spyControladorFin = spy(
			new ControladorPanelFin(modeloMock, vistaMock, controladorMock));

	@Test
	public void mostrarPanelFin() {
		doReturn(panelFinMock).when(spyControladorFin)
				.makePanelFin(any(ControladorPanelFin.class));

		spyControladorFin.mostrarPanelFin();
		verify(vistaMock, times(1)).mostrarPanel(panelFinMock);
	}

}
