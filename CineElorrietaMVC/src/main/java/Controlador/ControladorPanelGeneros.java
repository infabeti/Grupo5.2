package Controlador;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import Modelo.ArrayExtendible;
import Modelo.GestionDias;
import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelBienvenida;
import Vista.PanelFin;
import Vista.PanelGeneros;
import Vista.Vista;

public class ControladorPanelGeneros {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelGeneros panelGeneros;
	
	public ControladorPanelGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
		
	}
	
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
		this.ActualizarTexto();
		this.setCurrentDia(0);
	}
	
	public void accionadoBottonVolverPanelGeneros() {
		this.controlador.navegarPanelLogin();
	}
	
	public void accionadoBottonAceptarPanelGeneros() {
		this.controlador.navegarPanelResumen();
	}
	
	public void accionadoBottonGenroPanelGeneros(int Genero) {
		this.controlador.navegarPanelPelis(Genero);
	}
	
	public void setCurrentDia(int iDia)
	{
		this.modelo.getGestionDias().SetDia(iDia);
		this.ActualizarTexto();
	}
	
	public void ActualizarTexto()
	{
		JTextArea TextoPelis = panelGeneros.GetTextArea();
		JLabel HoraLabel = panelGeneros.getLabelHoras();
		GestionDias GestorDias = this.modelo.getGestionDias();
		HoraLabel.setText("Horas restantes: "+this.modelo.formatearTiempoString(GestorDias.getDia(GestorDias.GetSelectedDia()).MinutosRestantes()));
		ArrayExtendible<Pelicula> PelisHoy = GestorDias.getDia(GestorDias.GetSelectedDia()).getPelisHoy();
		String out="";
		for(int i=0;i<PelisHoy.getTamanio();i++)
		{
			out+= (i+1)+ " - " + PelisHoy.Recoger(i).getNombre()+" "+this.modelo.formatearTiempoString(PelisHoy.Recoger(i).getMinutosDuracion())+"\n";
		}
		TextoPelis.setText(out);
	}
	
	public PanelGeneros makePanelGeneros(ControladorPanelGeneros controladorGeneros) {
		return new PanelGeneros(controladorGeneros);
	}
}
