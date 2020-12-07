package Controlador;

import Modelo.Modelo;
import Vista.PanelBienvenida;
import Vista.PanelGeneros;
import Vista.Vista;

public class ControladorPanelGeneros {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelGeneros panelGeneros;
	private int CurrentDia;
	
	public ControladorPanelGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
		CurrentDia=0;
	}
	
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
	}
	
	public void accionadoBottonVolverPanelGeneros() {
		this.controlador.navegarPanelLogin();
	}
	
	public void accionadoBottonAceptarPanelGeneros() {
		this.controlador.navegarPanelResumen();
	}
	
	public void accionadoBottonGenroPanelGeneros(int Genero) {
		this.controlador.navegarPanelPelis();
	}
	
	public void setCurrentDia(int iDia)
	{
		CurrentDia = iDia;
	}
	
}
