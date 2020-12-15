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
		int resultado = this.modelo.getGestionDias().AnadirPelicula(PelisGenero.Recoger(elegida));
		switch(resultado)
		{
			case 1:
				this.controlador.LogearErrorUsuario("ERROR AL INSERTAR PELICULA", "La pelicula no puede ser insertada en el dia elegido, y en el otro dia existe una del mismo genero");
				break;
			case 2:
				this.controlador.LogearErrorUsuario("ERROR AL INSERTAR PELICULA", "La pelicula no puede ser insertada en el dia elegido, y ha sido insertada en el otro dia");
				break;
			case 3:
				this.controlador.LogearErrorUsuario("ERROR AL INSERTAR PELICULA", "La pelicula no puede ser insertada en el dia elegido, y no hay tiempo para insertarla en el otro dia");
				break;
		}
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
	
	public PanelPelis makePanelPelis(ControladorPanelPelis controladorPeliculas) {
		return new PanelPelis(controladorPeliculas);
	}

}


