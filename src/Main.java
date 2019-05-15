import GUI.Input;
import GUI.Menu;
import Logik.Controller;
import Util.VerySimpleFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {






    public Main() throws IOException {
    }




    public static void main(String[] args) throws IOException {
	// write your code here

     final Logger logger = Logger.getLogger(Test.class.getName());
     FileHandler handler = new FileHandler("/Users/nbh/Desktop/logs/Nik_loggingdemo.log");

        logger.setLevel(Level.FINEST);

        logger.addHandler(handler);
        handler.setFormatter(new VerySimpleFormatter());



        Input input = new Input();

       String go = "j";



        Controller controller = new Controller();



        while (go.equalsIgnoreCase("j")) {

            System.out.println(Menu.valg);

            controller.valg(input.getInt("skriv et tal"));


           go = input.getinput("j for at forsætte ");
      }



    }


}
