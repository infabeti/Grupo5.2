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
	
	public void accionadoBottonVolverPanelResumen() {
		this.controlador.navegarPanelGeneros();
	}

	public void accionadoBottonAceptarPanelResumen() {
		this.controlador.navegarPanelFin();
	}
	
	public void mostrarPanelResumen() {
		this.panelResumen = new PanelResumen(this);
		this.vista.mostrarPanel(this.panelResumen);
	}

}
