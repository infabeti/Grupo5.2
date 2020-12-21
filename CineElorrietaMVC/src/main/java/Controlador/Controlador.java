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
	private ControladorLoger controladorLoger;
	private ControladorPanelAdminPelis controladorPanelAdminPelis;

	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelBienvenida = makeControladorBienvenida(this.modelo, this.vista, this);
		this.controladorPanelGeneros = makeControladorGeneros(this.modelo, this.vista, this);
		this.controladorPanelLogin = makeControladorLogin(this.modelo, this.vista, this);
		this.controladorPanelPelis = makeControladorPeliculas(this.modelo, this.vista, this);
		this.controladorPanelFin = makeControladorFin(this.modelo, this.vista, this);
		this.controladorPanelEditar = makeControladorEditar(this.modelo, this.vista, this);
		this.controladorPanelResumen = makeControladorResumen(this.modelo, this.vista, this);
		this.controladorPanelAdminPelis = makeControladorAdminPelis(this.modelo, this.vista, this);
		this.controladorLoger = makeControladorLoger();
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
	
	public void navegarPanelAdminPelis() {
		this.controladorPanelAdminPelis.mostrarPanelAdminPelis();
	}
	
	public ControladorPanelBienvenida makeControladorBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelBienvenida(this.modelo, this.vista, this);
	}
	
	public ControladorPanelGeneros makeControladorGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelGeneros(this.modelo, this.vista, this);
	}
	
	public ControladorPanelPelis makeControladorPeliculas(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelPelis(this.modelo, this.vista, this);
	}
	
	public ControladorPanelFin makeControladorFin(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelFin(this.modelo, this.vista, this);
	}
	
	public ControladorPanelEditar makeControladorEditar(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelEditar(this.modelo, this.vista, this);
	}
	
	public ControladorPanelLogin makeControladorLogin(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelLogin(this.modelo, this.vista, this);
	}
	
	public ControladorPanelResumen makeControladorResumen(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelResumen(this.modelo, this.vista, this);
	}
	
	public ControladorPanelAdminPelis makeControladorAdminPelis(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelAdminPelis(this.modelo, this.vista, this);
	}
	
	public ControladorLoger makeControladorLoger() {
		return new ControladorLoger();
	}
	
	public void LogearErrorUsuario(String Nombre, String Descripcion)
	{
		this.controladorLoger.EscribirErrorUser(Nombre, Descripcion);
	}

}
