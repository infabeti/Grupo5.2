package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista.PanelAdminPelis;

public class ControladorPanelEditar{

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelAdminPelis panelEditar;
	
	public ControladorPanelEditar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEditar() {
		this.panelEditar = makePanelEditar(this);
		this.vista.mostrarPanel(this.panelEditar);
	}
	
	public void accionadoBottonVolverPanelEditar() {
		this.controlador.navegarPanelAdminPelis();
	}
	
	public void accionadoBottonAceptarPanelEditar() {
		this.controlador.navegarPanelAdminPelis();
	}
	
	public PanelAdminPelis makePanelEditar(ControladorPanelEditar controladorEditar) {
		return new PanelAdminPelis(controladorEditar);
	}
	
}
