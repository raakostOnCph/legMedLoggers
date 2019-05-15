package logKlasser;

import GUI.VerySimpleFormatter;
import Logik.Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Level7 {

    private static final Logger Controllerlogger = Logger.getLogger(Controller.class.getName());
    FileHandler Conhandler = new FileHandler("/Users/nbh/Desktop/logs/k7.log");


    public Level7() throws IOException {


        Controllerlogger.setLevel(Level.FINEST);

        Controllerlogger.addHandler(Conhandler);
        Conhandler.setFormatter(new VerySimpleFormatter());

    }

    public void log() {

        Controllerlogger.log(Level.SEVERE, "logger Servere til fil (7)", new RuntimeException("udskrivr Servere til consollen "));





    }
}
