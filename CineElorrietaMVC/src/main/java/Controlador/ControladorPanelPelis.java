package Controlador;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import Modelo.ArrayExtendible;
import Modelo.GestionPeliculas;
import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelPelis;
import Vista.Vista;

public class ControladorPanelPelis {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPelis panelPelis;
	private int Genero;
	private ArrayExtendible<Pelicula> PelisGenero;
	
	public ControladorPanelPelis(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void accionadoBottonVolverPanelPelis() {
		this.controlador.navegarPanelGeneros();
	}
	
	public void accionadoBottonAceptarPanelPelis() {
		JComboBox<Integer> GetPanelCombo = panelPelis.GetPanelCombo();
		int elegida = GetPanelCombo.getSelectedIndex();
		this.modelo.getGestionDias().AnadirPelicula(PelisGenero.Recoger(elegida));
		this.controlador.navegarPanelGeneros();
	}

	public void mostrarPanelPelis(int Genero) {
		this.panelPelis = new PanelPelis(this);
		this.Genero = Genero;
		this.vista.mostrarPanel(this.panelPelis);
		this.GetPelis();
		this.MostrarPelis();
	}
	
	public void GetPelis()
	{
		GestionPeliculas GP = this.modelo.getGestorPelis();
		PelisGenero = GP.GetPelisPorGenero(this.Genero);
	}
	
	public void MostrarPelis()
	{
		JTextArea PelisTextAra = panelPelis.GetTxtAreaPelis();
		JComboBox<Integer> ComboPelis = panelPelis.GetPanelCombo();
		String out="";
		for(int i=0;i<PelisGenero.getTamanio();i++)
		{
			ComboPelis.addItem(i);
			out+= i+ " - " + PelisGenero.Recoger(i).getNombre()+" "+this.modelo.formatearTiempoString(PelisGenero.Recoger(i).getMinutosDuracion())+"\n";
		}
		PelisTextAra.setText(out);
	}
	
	PanelPelis makePanelPelis(ControladorPanelPelis controladorPeliculas) {
		return new PanelPelis(controladorPeliculas);
	}

}


