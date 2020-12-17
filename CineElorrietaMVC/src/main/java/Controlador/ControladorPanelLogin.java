package Controlador;

import Modelo.GestionLogin;
import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.PanelGeneros;
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
	
	public void accionadoBottonMostrarPanelGeneros(String user, char[] password) {
		int result = this.modelo.getGestorLogin().compararContrasenas(user, password);
		if(result != 0)
		{
			this.controlador.navegarPanelGeneros();
			this.modelo.getGestionDias().GenerarNuevosDias();
		}
		else
			this.controlador.LogearErrorUsuario("ERROR LOGIN", "Se ha insertado un usuario y contraseña equivocadas");
	}

	public void mostrarPanelLogin() {
		this.panelLogin = makePanelLogin(this);
		this.vista.mostrarPanel(this.panelLogin);
	}
	
	public PanelLogin makePanelLogin(ControladorPanelLogin controladorLogin) {
		return new PanelLogin(controladorLogin);
	}

}
