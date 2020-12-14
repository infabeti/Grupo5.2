package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista.*;

public class ControladorPanelFin {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelFin panelFin;
	private PanelBienvenida panelBienvenida;

	public ControladorPanelFin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;
	}

	public void mostrarPanelFin() {
		this.panelFin = new PanelFin(this);
		this.vista.mostrarPanel(this.panelFin);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		this.controlador.navegarPanelBienvenida();
	}
	
	public PanelFin makePanelFin(ControladorPanelFin controladorFin) {
		return new PanelFin(controladorFin);
	}

}
