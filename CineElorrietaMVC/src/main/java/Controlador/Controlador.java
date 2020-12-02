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

	public void navegarPanelPelis() {
		this.controladorPanelPelis.mostrarPanelPelis();
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
	
	public ControladorPanelBienvenida makeControladorPanelBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelBienvenida(modelo, vista, this);
	}
	
	public ControladorPanelGeneros makeControladorPanelGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelGeneros(modelo, vista, this);
	}
	
	public ControladorPanelPelis makeControladorPanelPelis(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelPelis(modelo, vista, this);
	}
	
	public ControladorPanelEditar makeControladorPanelEditar(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelEditar(modelo, vista, this);
	}
	
	public ControladorPanelFin makeControladorPanelFin(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelFin(modelo, vista, this);
	}
	
	public ControladorPanelLogin makeControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelLogin(modelo, vista, this);
	}
	
	public ControladorPanelResumen makeControladorPanelResumen(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelResumen(modelo, vista, this);
	}
}
