package logKlasser;

import GUI.VerySimpleFormatter;
import Logik.Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level3 {

    private static final Logger Controllerlogger = Logger.getLogger(Controller.class.getName());
    FileHandler Conhandler = new FileHandler("/Users/nbh/Desktop/logs/k3.log");


    public Level3() throws IOException {


        Controllerlogger.setLevel(Level.FINEST);

        Controllerlogger.addHandler(Conhandler);
        Conhandler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        Controllerlogger.log(Level.FINE, "logger Servere til fil (3)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
