package Controlador;

import Modelo.Modelo;
import Vista.*;

public class ControaldorPanelEditar{

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelFin panelFin;
	
	public ControaldorPanelEditar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEditar() {
		this.panelEditar = new PanelEditar(this);
		this.vista.mostrarPanel(this.panelFin);
	}
	
	public void accionadoBottonMostrarPanelGeneros() {
		this.controlador.navegarPanelGeneros();
	}
}
