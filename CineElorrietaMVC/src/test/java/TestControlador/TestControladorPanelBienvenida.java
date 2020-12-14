package TestControlador;

import Controlador.*;
import Modelo.Modelo;
import Vista.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestControladorPanelBienvenida {

	private ControladorPanelBienvenida controladorBienvenida;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);

	private PanelBienvenida panelBienvenidaMock = mock(PanelBienvenida.class);
	private ControladorPanelBienvenida spyControladorBienvenida = spy(
			new ControladorPanelBienvenida(modeloMock, vistaMock, controladorMock));

	@Test
	public void mostrarPanelBienvenida() {
		doReturn(panelBienvenidaMock).when(spyControladorBienvenida).makePanelBienvenida(any(ControladorPanelBienvenida.class));

		spyControladorBienvenida.mostrarPanelBienvenida();
		verify(vistaMock, times(1)).mostrarPanel(panelBienvenidaMock);
	}

	@Test
	public void accionadoBottonMostrarPanelLogin() {
		controladorBienvenida = new ControladorPanelBienvenida(modeloMock, vistaMock, controladorMock);

		controladorBienvenida.accionadoBottonMostrarPanelLogin();

		verify(controladorMock, times(1)).navegarPanelLogin();
	}

}
