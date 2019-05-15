package GUI;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Input {


    private static final Logger Inputlogger = Logger.getLogger(Input.class.getName());
    FileHandler Inputhandler = new FileHandler("/Users/nbh/Desktop/logs/INPUTlogging.log");

    public Input() throws IOException {

        Inputlogger.setLevel(Level.FINEST);

        Inputlogger.addHandler(Inputhandler);
        Inputhandler.setFormatter(new VerySimpleFormatter());




    }


    public  String getinput(String s) {

        Inputlogger.log(Level.FINEST,"getinput kaldes");

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


            }
        }

    }
}
