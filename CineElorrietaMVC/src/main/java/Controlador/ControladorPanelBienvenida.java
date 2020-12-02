package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista.PanelBienvenida;
import Vista.PanelGeneros;

public class ControladorPanelBienvenida {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBienvenida panelBienvenida;
	private PanelGeneros panelGeneros;

	public ControladorPanelBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;
	}

	public void mostrarPanelBienvenida() {
		this.panelBienvenida = new PanelBienvenida(this);
		this.vista.mostrarPanel(this.panelBienvenida);
		accionadoBottonMostrarPanelGeneros();
	}

	public void accionadoBottonMostrarPanelGeneros() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		this.controlador.navegarPanelGeneros();
	}

}
