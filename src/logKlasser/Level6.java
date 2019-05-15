package logKlasser;

import Util.VerySimpleFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level6 {

    private static final Logger LOGGER = Logger.getLogger(Level6.class.getName());

    //todo Husk at lave stien om, så den passer til dig. Husk pwd på linux for at få stien !
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/k6.log");


    public Level6() throws IOException {


        LOGGER.setLevel(Level.FINEST);

        LOGGER.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        LOGGER.log(Level.WARNING, "LOGGER Servere til fil (6)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
