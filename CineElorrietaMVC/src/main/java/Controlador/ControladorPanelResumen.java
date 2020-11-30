package Controlador;

import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.PanelResumen;
import Vista.Vista;

public class ControladorPanelResumen {
	
	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelResumen panelResumen;
	
	public ControladorPanelResumen(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void accionadoBottonMostrarPanelGeneros() {
		this.controlador.navegarPanelPelis();
	}

	public void mostrarPanelPelis() {
		this.panelResumen = new PanelResumen(this);
		this.vista.mostrarPanel(this.panelResumen);
	}

	public PanelResumen makePanelResumen(ControladorPanelResumen controladorpanelresumen) {
		return new PanelResumen(controladorpanelresumen);
	}
}
