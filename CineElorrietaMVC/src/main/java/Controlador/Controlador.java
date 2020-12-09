package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	private ControladorPanelGeneros controladorPanelGeneros;
	private ControladorPanelPelis controladorPanelPelis;
	private ControladorPanelEditar controladorPanelEditar;
	private ControladorPanelFin controladorPanelFin;
	private ControladorPanelLogin controladorPanelLogin;
	private ControladorPanelResumen controladorPanelResumen;

	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelBienvenida = new ControladorPanelBienvenida(this.modelo, this.vista, this);
		this.controladorPanelGeneros = new ControladorPanelGeneros(this.modelo, this.vista, this);
		this.controladorPanelLogin = new ControladorPanelLogin(this.modelo, this.vista, this);
		this.controladorPanelPelis = new ControladorPanelPelis(this.modelo, this.vista, this);
		this.controladorPanelFin = new ControladorPanelFin(this.modelo, this.vista, this);
		this.controladorPanelEditar = new ControladorPanelEditar(this.modelo, this.vista, this);
		this.controladorPanelResumen = new ControladorPanelResumen(this.modelo, this.vista, this);
		this.navegarPanelBienvenida();
	}

	public void navegarPanelBienvenida() {
		this.controladorPanelBienvenida.mostrarPanelBienvenida();
	}

	public void navegarPanelGeneros() {
		this.controladorPanelGeneros.mostrarPanelGeneros();
	}

	public void navegarPanelPelis(int Genero) {
		this.controladorPanelPelis.mostrarPanelPelis(Genero);
	}

	public void navegarPanelFin() {
		this.controladorPanelFin.mostrarPanelFin();
	}

	public void navegarPanelEditar() {
		this.controladorPanelEditar.mostrarPanelEditar();
	}

	public void navegarPanelLogin() {
		this.controladorPanelLogin.mostrarPanelLogin();
	}
	
	public void navegarPanelResumen() {
		this.controladorPanelResumen.mostrarPanelResumen();
	}

}
