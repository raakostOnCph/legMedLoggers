package GUI;

import Util.VerySimpleFormatter;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TerminalInput {


    private static final Logger LOGGER = Logger.getLogger(TerminalInput.class.getName());

    //todo Husk at lave stien om, så den passer til dig. Husk pwd på linux for at få stien !
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/INPUTlogging.log");

    public TerminalInput() throws IOException {

        LOGGER.setLevel(Level.FINEST);

        LOGGER.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());




    }


    public  String getinput(String s) {

        LOGGER.log(Level.FINEST,"getinput kaldes");

        System.out.println(s);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }

    public int getInt(String s ) {

        while (true) {
            try {
                return Integer.parseInt(getinput(s));
            } catch (NumberFormatException e) {
                System.out.println("tast da et tal klovn");

                //todo skriv fil at vi har fået forkert input.



            }
        }

    }
}
