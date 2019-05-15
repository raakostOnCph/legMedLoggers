import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {


    private static final Logger logger = Logger.getLogger(Test.class.getName());
    FileHandler handler = new FileHandler("/Users/nbh/Desktop/Nik_loggingdemo.log");


    public Test() throws IOException {
        logger.setLevel(Level.FINEST);

        logger.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());

    }


    public String udskriv() {

        logger.log(Level.FINEST,"det her er den aller fineste");

        return "hej med dig";

    }

    public String getNavn(String s) {

//        logger.addHandler(handler);
//        handler.setFormatter(new VerySimpleFormatter());


        logger.log(Level.SEVERE, "Hello logging");
        //logger.entering(getClass().getName(), "funktionen er kaldt" );

        logger.log(Level.SEVERE, "Der er sket en fejl", new RuntimeException("Her er sket en fejl "));


        System.out.println(s);
        Scanner scanner = new Scanner(System.in);

        //logger.exiting(getClass().getName(), "doIt");

        return scanner.nextLine().toUpperCase();


    }

}



