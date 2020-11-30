package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista.PanelBienvenida;
import Vista.PanelFin;

public class ControladorPanelFin {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelFin panelFin;

	public ControladorPanelFin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;
	}

	public void mostrarPanelFin() {
		this.panelFin = new PanelFin(this);
		this.vista.mostrarPanel(this.panelFin);
	}

	public void accionadoBottonMostrarPanelFin() {
		this.controlador.navegarPanelFin();
	}

	public PanelFin makePanelFin(ControladorPanelFin controladorpanelfin) {
		return new PanelFin(controladorpanelfin);
	}
}
