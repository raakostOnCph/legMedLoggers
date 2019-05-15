package logKlasser;

import Util.VerySimpleFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level7 {

    private static final Logger LOGGER = Logger.getLogger(Level7.class.getName());

    //todo Husk at lave stien om, så den passer til dig. Husk pwd på linux for at få stien !
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/k7.log");


    public Level7() throws IOException {


        LOGGER.setLevel(Level.FINEST);

        LOGGER.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        LOGGER.log(Level.SEVERE, "LOGGER Servere til fil (7)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
