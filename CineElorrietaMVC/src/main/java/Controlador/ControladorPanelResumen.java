package Controlador;

import javax.swing.JTextArea;

import Modelo.ArrayExtendible;
import Modelo.GestionDias;
import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelBienvenida;
import Vista.PanelPelis;
import Vista.PanelResumen;
import Vista.Vista;

public class ControladorPanelResumen {
	
	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelResumen panelResumen;
	
	public ControladorPanelResumen(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void accionadoBottonVolverPanelResumen() {
		this.controlador.navegarPanelGeneros();
	}

	public void accionadoBottonAceptarPanelResumen() {
		this.controlador.navegarPanelFin();
	}
	
	public void mostrarPanelResumen() {
		this.panelResumen = makePanelResumen(this);
		this.vista.mostrarPanel(this.panelResumen);
		this.ActualizarTexto();
	}
	
	public PanelResumen makePanelResumen(ControladorPanelResumen controladorResumen) {
		return new PanelResumen(controladorResumen);
	}
	
	public void ActualizarTexto()
	{
		GestionDias GestorDias = this.modelo.getGestionDias();
		JTextArea[] AreasTexto = panelResumen.getTextAreas();
		for(int i=0;i<2;i++)
		{
			ArrayExtendible<Pelicula> PelisHoy = GestorDias.getDia(i).getPelisHoy();
			String out="";
			for(int y=0;y<PelisHoy.getTamanio();y++)
			{
				out+= (y+1)+ " - " + PelisHoy.Recoger(y).getNombre()+" "+this.modelo.formatearTiempoString(PelisHoy.Recoger(y).getMinutosDuracion())+"\n";
			}
			AreasTexto[i].setText(out);
		}
		
	}

}
