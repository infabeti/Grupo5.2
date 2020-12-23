package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista.PanelBienvenida;
import Vista.PanelPelis;

public class ControladorPanelBienvenida {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBienvenida panelBienvenida;

	public ControladorPanelBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;
	}

	public void mostrarPanelBienvenida() {
		this.panelBienvenida = makePanelBienvenida(this);
		this.vista.mostrarPanel(this.panelBienvenida);
		accionadoBottonMostrarPanelLogin();
	}

	public void accionadoBottonMostrarPanelLogin() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		this.controlador.navegarPanelLogin();
	}
	
	public PanelBienvenida makePanelBienvenida(ControladorPanelBienvenida controladorBienvenida) {
		return new PanelBienvenida(controladorBienvenida);
	}

}
