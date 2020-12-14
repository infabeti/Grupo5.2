package Modelo;

import javax.swing.JOptionPane;

public class GestionDias {
	private Dia[] ListaDias;
	private int DiaSeleccionado;
	
	public GestionDias()
	{
		DiaSeleccionado =0;
		ListaDias = new Dia[2];
		this.GenerarNuevosDias();
	}
	
	public void SetDia(int Dia)
	{
		DiaSeleccionado = Dia;
	}
	
	public int GetSelectedDia()
	{
		return DiaSeleccionado;
	}
	
	public void GenerarNuevosDias()
	{
		ListaDias[0] = new Dia(480);
		ListaDias[1] = new Dia(360);
	}
	
	public void AnadirPelicula(Pelicula inPeli)
	{
		if(ListaDias[DiaSeleccionado].CabePeli(inPeli.getMinutosDuracion()))
		{
			ArrayExtendible<Integer> GenerosHoy = ListaDias[DiaSeleccionado].GetGenerosHoy();
			for(int i=0;i<GenerosHoy.getTamanio();i++)
			{
				if(inPeli.getCodigoGenero()==GenerosHoy.Recoger(i))
				{
					JOptionPane.showMessageDialog(null,
						    "Ya existe una peli del mismo genero en el mismo, la peli no sera insertada",
						    "AVISO.",
						    JOptionPane.WARNING_MESSAGE);
					AnadirPeliOtroDia(inPeli);
					return;
				}
			}
			ListaDias[DiaSeleccionado].AnadirPelicula(inPeli);
			return;
		}
		JOptionPane.showMessageDialog(null,
			    "La peli elegida no cabe en el dia selecciano, probando el otro",
			    "AVISO.",
			    JOptionPane.WARNING_MESSAGE);
		AnadirPeliOtroDia(inPeli);
	}
	public void AnadirPeliOtroDia(Pelicula inPeli)
	{
		
		if(DiaSeleccionado==0)
		{
			if(ListaDias[1].CabePeli(inPeli.getMinutosDuracion()))
			{
				ArrayExtendible<Integer> GenerosHoy = ListaDias[1].GetGenerosHoy();
				for(int i=0;i<GenerosHoy.getTamanio();i++)
				{
					if(inPeli.getCodigoGenero()==GenerosHoy.Recoger(i))
					{
						JOptionPane.showMessageDialog(null,
							    "Ya existe una peli del mismo genero en el otro dia, la peli no sera insertada",
							    "AVISO.",
							    JOptionPane.WARNING_MESSAGE);
						return;
					}
				}
				ListaDias[1].AnadirPelicula(inPeli);
				return;
			}
		}
		else
		{
			if(ListaDias[0].CabePeli(inPeli.getMinutosDuracion()))
			{
				ArrayExtendible<Integer> GenerosHoy = ListaDias[0].GetGenerosHoy();
				for(int i=0;i<GenerosHoy.getTamanio();i++)
				{
					if(inPeli.getCodigoGenero()==GenerosHoy.Recoger(i))
					{
						JOptionPane.showMessageDialog(null,
							    "Ya existe una peli del mismo genero en el otro dia, la peli no sera insertada",
							    "AVISO.",
							    JOptionPane.WARNING_MESSAGE);
						return;
					}
				}
				ListaDias[0].AnadirPelicula(inPeli);
				return;
			}
		}
		JOptionPane.showMessageDialog(null,
			    "La peli elegida no cabe en otro dia, no sera insertada",
			    "AVISO.",
			    JOptionPane.WARNING_MESSAGE);
	}
	
	
	public Dia getDia(int iDia)
	{
		return ListaDias[iDia];
	}
	
}
