package Controlador;

import Modelo.Modelo;
import Vista.*;

public class ControladorPanelEditar{

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEditar panelEditar;
	
	public ControladorPanelEditar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.vista.mostrarPanel(this.panelEditar);
	}
	
	public void accionadoBottonMostrarPanelGeneros() {
		this.controlador.navegarPanelGeneros();
	}
}
