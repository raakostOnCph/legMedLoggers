package logKlasser;

import GUI.VerySimpleFormatter;
import Logik.Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level7 {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/k7.log");


    public Level7() throws IOException {


        logger.setLevel(Level.FINEST);

        logger.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        logger.log(Level.SEVERE, "logger Servere til fil (7)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
