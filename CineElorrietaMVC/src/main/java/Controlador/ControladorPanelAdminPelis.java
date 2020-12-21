package Controlador;

import Modelo.Modelo;
import Vista.PanelEditar;
import Vista.PanelAdminPelis;
import Vista.Vista;

public class ControladorPanelAdminPelis {
	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEditar panelAdminPelis;
	
	public ControladorPanelAdminPelis(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelAdminPelis() {
		this.panelAdminPelis = makePanelAdminPelis(this);
		this.vista.mostrarPanel(this.panelAdminPelis);
	}
	
	public void accionadoBottonVolverPanelAdminPelis() {
		this.controlador.navegarPanelLogin();
	}
	
	public void accionadoBottonAceptarPanelAdminPelis() {
		this.controlador.navegarPanelFin();
	}
	
	public void accionadoBottonEditarPanelAdminPelis() {
		this.controlador.navegarPanelEditar();
	}
	
	public void accionadoBottonBorrarPanelAdminPelis() {
		this.controlador.navegarPanelAdminPelis();
	}
	
	public void accionadoBottonAñadirPanelAdminPelis() {
		this.controlador.navegarPanelEditar();
	}
	
	public PanelEditar makePanelAdminPelis(ControladorPanelAdminPelis controladorAdminPelis) {
		return new PanelEditar(controladorAdminPelis);
	}

}
