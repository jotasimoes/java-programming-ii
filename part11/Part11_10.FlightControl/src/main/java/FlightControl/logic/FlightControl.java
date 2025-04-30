/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BLC3
 */
public class FlightControl {
    
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addPlane(String ID, int capacity){
        Airplane airplane = new Airplane(ID, capacity);
        airplanes.put(ID, airplane);
    }
    
    public void addFlight(Airplane plane, String depID, String destID){
        this.places.putIfAbsent(depID, new Place(depID));
        this.places.putIfAbsent(destID, new Place(destID));        
        
        Flight flight = new Flight(plane, this.places.get(depID), this.places.get(destID)); 
        
        this.flights.put(flight.toString(), flight);
    }

    public Airplane getPlaneById(String id){
        
        return this.airplanes.get(id);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Collection<Place> getPlaces() {
        return this.places.values();
    }
    
    
            
}
