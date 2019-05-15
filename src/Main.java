import GUI.Input;
import GUI.Menu;
import Logik.Controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {






    public Main() throws IOException {
    }




    public static void main(String[] args) throws IOException {
	// write your code here

     final Logger mainlogger = Logger.getLogger(Test.class.getName());
     FileHandler mainhandler = new FileHandler("/Users/nbh/Desktop/logs/Nik_loggingdemo.log");

        mainlogger.setLevel(Level.FINEST);

        mainlogger.addHandler(mainhandler);
        mainhandler.setFormatter(new VerySimpleFormatter());



//        Test test = null;
//        try {
//            test = new Test();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(test.getNavn("skriv dit navn"));
//       System.out.println(test.udskriv());

        Input input = new Input();

//        input.getinput("skriv et tal");
//
       String go = "j";



        Controller controller = new Controller();



        while (go.equalsIgnoreCase("j")) {

            System.out.println(Menu.valg);

            controller.valg(input.getInt("skriv et tal"));


           go = input.getinput("j for at forsætte ");
      }

            /*det ser ud til at vi kun har tre niveauer til rådighed
            *  prøv med 1,2,3 og sammenlign med med 1-7
            *
            * Ok jeg tror at jeg har luret den.
            *
            * For at sætte handleren på loggeren skal vi brugen
            * construktor. Det var første hug. Jeg kan bare ikke rigtigt forstå
            * hvorfor man ikke kan gøre det main.
            *
            * */


//            test.udskriv();



    }


}
