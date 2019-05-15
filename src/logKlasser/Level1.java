package logKlasser;

import GUI.VerySimpleFormatter;
import Logik.Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level1 {

    private static final Logger k1logger = Logger.getLogger(Level1.class.getName());
    FileHandler k1handler = new FileHandler("/Users/nbh/Desktop/logs/Level1.log");


    public Level1() throws IOException {


        k1logger.setLevel(Level.FINEST);

        k1logger.addHandler(k1handler);
        k1handler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        k1logger.log(Level.FINEST, "logger Servere til fil (1)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
