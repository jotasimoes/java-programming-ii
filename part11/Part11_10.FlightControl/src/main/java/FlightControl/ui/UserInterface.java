/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author BLC3
 */
public class UserInterface {
    
    private Scanner sc;
    private FlightControl flightControl;

    public UserInterface(Scanner sc, FlightControl flightControl) {
        this.sc = sc;
        this.flightControl = flightControl;
    }
    
    public void start(){
        assetControl();
        System.out.println("");
        flightControl();
        System.out.println("");
    }
    
    private void assetControl(){
         System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            String escolha = sc.nextLine();
             
            if(escolha.equals("1")){
                addPlane();
            }
            else if(escolha.equals("2")){
                addFlight();
            }
            else if(escolha.equals("x")){
                break;
            }
        }        
    }
    
    private void flightControl(){
         System.out.println("Flight Control");
        System.out.println("-------------");
        System.out.println();
        
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            String escolha = sc.nextLine();
             
            if(escolha.equals("1")){
                printPlanes();
            }
            else if(escolha.equals("2")){
                printFlights();
            }
            else if(escolha.equals("3")){
                printPlaneDetails();
            }
            else if(escolha.equals("x")){
                break;
            }
        }        
    }

    private void addPlane() {
        System.out.println("Give the airplane id: ");
        String id = sc.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.parseInt(sc.nextLine());
        
        this.flightControl.addPlane(id, capacity);        
    }

    private void addFlight() {
        System.out.println("Give the airplane id: ");
        Airplane plane = askForPlane();
        System.out.println("Give the departure airport id: ");
        String depID = sc.nextLine();
        System.out.println("Give the target airport id: ");
        String destID = sc.nextLine();
        
        this.flightControl.addFlight(plane, depID, destID);
    }
                
    private Airplane askForPlane(){
            Airplane airplane = null;
        while (airplane == null) {
            String id = sc.nextLine();
            airplane = flightControl.getPlaneById(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
        
    }

    private void printPlanes() {
        
        for(Airplane plane: this.flightControl.getAirplanes()){
            System.out.println(plane);
        }
    }

    private void printFlights() {
        
        for(Flight flight: this.flightControl.getFlights()){
            System.out.println(flight);
        }
    }

    private void printPlaneDetails() {
        System.out.println("Give the airplane id: ");
       Airplane plane = this.askForPlane();
        System.out.println(plane);
       
    }
    
}
