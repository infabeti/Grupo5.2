package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeerPeliculas {
	public ArrayExtendible<Pelicula> LeerPeliculasDeArchivo() throws FileNotFoundException, IOException
	{
		File ArchivoPelis = new File("ListaPelis.txt");
		if(ArchivoPelis.createNewFile())//en caso de que el archivo no exista, lo creamos y lo llenamos con las pelis basicas
		{
			FileWriter oFile = new FileWriter(ArchivoPelis, false); 
			oFile.write("1*1*'Handia'*116\n");
			oFile.write("1*2*'La lista de Schindler'*197\n");
			oFile.write("1*3*'Cadena Perpetua'*142\n");
			oFile.write("1*4*'Million Dollar Baby'*133\n");
			oFile.write("2*5*'2001: Odisea en el espacio'*142\n");
			oFile.write("2*6*'La novia de Frankenstein'*75\n");
			oFile.write("2*7*'El planeta de los simios'*115\n");
			oFile.write("2,8*'Alien* el octavo pasajero'*117\n");
			oFile.write("3*9*'Scary movie'*90\n");
			oFile.write("3*10*'El gran Lebowsky'*119\n");
			oFile.write("3*11*'La vida de Brian'*94\n");
			oFile.write("3*12*'Aterriza como puedas'*88\n");
			oFile.write("4*13*'Psicosis'*109\n");
			oFile.write("4*14*'El resplandor'*146\n");
			oFile.write("4*15*'Dracula'*155\n");
			oFile.write("4*16*'Cisne negro'*110\n");
			oFile.close();
		}
		
		ArrayExtendible<Pelicula> PelisArchivo = new ArrayExtendible<Pelicula>();
		Scanner Lector = new Scanner(ArchivoPelis);
	    while (Lector.hasNextLine()) 
	    {
	        String InfoPeli = Lector.nextLine();
	        PelisArchivo.Anadir(new Pelicula(InfoPeli));
	    }
	    Lector.close();
		return PelisArchivo;
	}
}
