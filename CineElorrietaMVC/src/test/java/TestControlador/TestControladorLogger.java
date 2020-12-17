package TestControlador;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

import Controlador.*;
import Modelo.*;
import Vista.*;

public class TestControladorLogger {
	
	private Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Test
	public void testSetup() throws IOException {
		ControladorLoger.setup();
	}

}
