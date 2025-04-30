package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.UserInterface;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       UserInterface ui = new UserInterface(sc, new FlightControl());
       ui.start();
    }
}
