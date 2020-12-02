package Controlador;

import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.PanelLogin;
import Vista.Vista;

public class ControladorPanelLogin {
	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogin panelLogin;
	
	public ControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void accionadoBottonMostrarPanelLogin() {
		this.controlador.navegarPanelLogin();
	}

	public void mostrarPanelLogin() {
		this.panelLogin = new PanelLogin(this);
		this.vista.mostrarPanel(this.panelLogin);
	}

}
