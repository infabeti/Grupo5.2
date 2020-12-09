package Controlador;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import Modelo.ArrayExtendible;
import Modelo.GestionPeliculas;
import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelBienvenida;
import Vista.PanelPelis;
import Vista.Vista;

public class ControladorPanelPelis {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPelis panelPelis;
	private int Genero;
	
	public ControladorPanelPelis(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void accionadoBottonVolverPanelPelis() {
		this.controlador.navegarPanelGeneros();
	}
	
	public void accionadoBottonAceptarPanelPelis() {
		this.controlador.navegarPanelResumen();
	}

	public void mostrarPanelPelis(int Genero) {
		this.panelPelis = new PanelPelis(this);
		this.Genero = Genero;
		this.vista.mostrarPanel(this.panelPelis);
		this.MostrarPelis();
	}
	
	public void MostrarPelis()
	{
		GestionPeliculas GP = this.modelo.getGestorPelis();
		JTextArea PelisTextAra = panelPelis.GetTxtAreaPelis();
		JComboBox<Integer> ComboPelis = panelPelis.GetPanelCombo();
		ArrayExtendible<Pelicula> PelisGenero = GP.GetPelisPorGenero(this.Genero);
		String out="";
		for(int i=0;i<PelisGenero.getTamanio();i++)
		{
			ComboPelis.addItem(i);
			out+= i+ " - " + PelisGenero.Recoger(i).getNombre()+" "+this.modelo.formatearTiempoString(PelisGenero.Recoger(i).getMinutosDuracion())+"\n";
		}
		PelisTextAra.setText(out);
	}

}


