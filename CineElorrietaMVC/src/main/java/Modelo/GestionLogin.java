package Modelo;

import java.util.Arrays;

public class GestionLogin {
	private String[] Usuarios;
	private char[][] Contrasenas;
	
	public GestionLogin()
	{
		Usuarios = new String[2];
		Usuarios[0] = "admin";
		Usuarios[1] = "editor";
		Contrasenas=new char[2][];
		Contrasenas[0] = "nimda".toCharArray();
		Contrasenas[1] = "contra".toCharArray();
	}
	
	public int compararContrasenas(String inUsuario,char[] inContrasena)
	{
		for(int i=0;i<2;i++)
		{
			if(Usuarios[i].equals(inUsuario))
				if(Arrays.equals(Contrasenas[i], inContrasena))
					return i+1;
		}
		return 0;
	}
}
