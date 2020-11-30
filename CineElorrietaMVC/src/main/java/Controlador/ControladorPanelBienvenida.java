package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista.PanelBienvenida;

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
		this.panelBienvenida = new PanelBienvenida(this);
		this.vista.mostrarPanel(this.panelBienvenida);
	}

	public void accionadoBottonMostrarPanelGeneros() {
		this.controlador.navegarPanelGeneros();
	}

	public PanelBienvenida makePanelBienvenida(ControladorPanelBienvenida controladorpanelbienvenida) {
		return new PanelBienvenida(controladorpanelbienvenida);
	}
}
