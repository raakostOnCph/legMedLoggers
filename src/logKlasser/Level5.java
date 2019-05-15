package logKlasser;

import GUI.VerySimpleFormatter;
import Logik.Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level5 {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/k5.log");


    public Level5() throws IOException {


        logger.setLevel(Level.FINEST);

        logger.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        logger.log(Level.INFO, "logger Servere til fil (5)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
