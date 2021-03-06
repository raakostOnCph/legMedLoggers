package Logik;

import Util.VerySimpleFormatter;
import logKlasser.*;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {




    private static final Logger LOGGER = Logger.getLogger(Logik.Controller.class.getName());

    //todo Husk at lave stien om, så den passer til dig. Husk pwd på linux for at få stien !
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/controller_logger.log");


    public Controller() throws IOException {

        LOGGER.setLevel(Level.FINEST);

        LOGGER.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());
        handler.setLevel(Level.FINEST);       // her sætter vi niveauet for logfilen

        ConsoleHandler Chandler = new ConsoleHandler();
        LOGGER.addHandler(Chandler);
        Chandler.setLevel(Level.FINEST); // her sætter vi niveauet for consollen

    }

public void valg(int i) throws IOException {


    Level1 level1 = new Level1();
    Level2 level2 = new Level2();
    Level3 level3 = new Level3();
    Level4 level4 = new Level4();
    Level5 level5 = new Level5();
    Level6 level6 = new Level6();
    Level7 level7 = new Level7();

    switch(i)

    {

        case 7:
            LOGGER.log(Level.SEVERE, "LOGGER Servere til fil (7)", new RuntimeException("udskriver Servere til consollen "));
//            level7.log();

            break;
        case 6:
            LOGGER.log(Level.WARNING, "LOGGER WARNING til fil (6)", new RuntimeException("udskriver WARNING til consollen "));
//            level6.log();
            break;
        case 5:
            LOGGER.log(Level.INFO, "LOGGER INFO til fil (5)", new RuntimeException("udskriver INFO til consollen "));
//            level5.log();
            break;
        case 4:
            LOGGER.log(Level.CONFIG, "LOGGER CONFIG til fil (4)", new RuntimeException("udskriver CONFIG til consollen "));
//            level4.log();
            break;
        case 3:
            LOGGER.log(Level.FINE, "LOGGER FINE til fil (3)", new RuntimeException("udskriver FINE til consollen "));
//            level3.log();
            break;
        case 2:
            LOGGER.log(Level.FINER, "LOGGER FINER til fil (2)", new RuntimeException("udskrivr FINER til consollen "));
//            level2.log();
            break;
        case 1:
          //  LOGGER.log(Level.FINEST, "det her er den aller fineste FRA SWITCHEN");
            level1.log();
            break;

        default:
            break;
    }

}

}
