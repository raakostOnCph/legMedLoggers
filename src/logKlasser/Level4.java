package logKlasser;

import Logik.Controller;
import Util.VerySimpleFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level4 {

    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());

    //todo Husk at lave stien om, så den passer til dig. Husk pwd på linux for at få stien !
    FileHandler Conhandler = new FileHandler("/Users/nbh/Desktop/logs/k4.log");


    public Level4() throws IOException {


        LOGGER.setLevel(Level.FINEST);

        LOGGER.addHandler(Conhandler);
        Conhandler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        LOGGER.log(Level.CONFIG, "logger Servere til fil (4)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
