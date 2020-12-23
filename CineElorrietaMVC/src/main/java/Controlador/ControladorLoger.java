package Controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ControladorLoger {
	static public void setup() throws IOException {

        
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

        logger.setLevel(Level.INFO);
        FileHandler fileTxt = new FileHandler("Logging.txt",true);


         
        SimpleFormatter formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);
    }
	
	public void EscribirErrorUser(String Nombre, String Descripcion)
	{
		try {
			 FileWriter Escritor = new FileWriter("ErroresUsuario.txt",true);
			 Escritor.write("--------------------------\n");
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			 LocalDateTime now = LocalDateTime.now();
			 Escritor.write(dtf.format(now)+"\n");
		     Escritor.write(Nombre+"\n");
		     Escritor.write(Descripcion+"\n");
		     Escritor.close();
		      
		    } catch (IOException e) {
		     
		      e.printStackTrace();
		    }
	}
}
