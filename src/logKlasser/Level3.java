package logKlasser;

import Util.VerySimpleFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level3 {

    private static final Logger LOGGER = Logger.getLogger(Level3.class.getName());

    //todo Husk at lave stien om, så den passer til dig. Husk pwd på linux for at få stien !
    FileHandler Conhandler = new FileHandler("/Users/nbh/Desktop/logs/k3.log");


    public Level3() throws IOException {


        LOGGER.setLevel(Level.FINEST);

        LOGGER.addHandler(Conhandler);
        Conhandler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        LOGGER.log(Level.FINE, "logger Servere til fil (3)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
