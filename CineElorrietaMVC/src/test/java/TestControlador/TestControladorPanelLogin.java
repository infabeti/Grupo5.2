package TestControlador;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorPanelLogin;
import Modelo.Modelo;
import Vista.PanelLogin;
import Vista.Vista;

public class TestControladorPanelLogin {
	
	private ControladorPanelLogin controladorLogin;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);
	private Controlador controladorMock = mock(Controlador.class);

	private PanelLogin panelLoginMock = mock(PanelLogin.class);
	private ControladorPanelLogin spyControladorLogin = spy(
			new ControladorPanelLogin(modeloMock, vistaMock, controladorMock));

	@Test
	public void mostrarPanelLogin() {
		doReturn(panelLoginMock).when(spyControladorLogin).makePanelLogin(any(ControladorPanelLogin.class));

		spyControladorLogin.mostrarPanelLogin();
		verify(vistaMock, times(1)).mostrarPanel(panelLoginMock);
	}

	@Test
	public void accionadoBottonMostrarPanelGeneros() {
		String user = "admin";
		char passw[] = {'n', 'i', 'm', 'd', 'a'}; 
		
		controladorLogin = new ControladorPanelLogin(modeloMock, vistaMock, controladorMock);

		controladorLogin.accionadoBottonMostrarPanelGeneros(user, passw);

		verify(controladorMock, times(1)).navegarPanelLogin();
	}

}
