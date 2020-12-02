package Controlador;

import Modelo.Modelo;
import Vista.Vista;
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

}
