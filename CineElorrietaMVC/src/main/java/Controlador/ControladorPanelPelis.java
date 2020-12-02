package Controlador;

import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.PanelPelis;
import Vista.Vista;

public class ControladorPanelPelis {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPelis panelPelis;
	
	public ControladorPanelPelis(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void accionadoBottonMostrarPanelGeneros() {
		this.controlador.navegarPanelPelis();
	}

	public void mostrarPanelPelis() {
		this.panelPelis = new PanelPelis(this);
		this.vista.mostrarPanel(this.panelPelis);
	}

}


