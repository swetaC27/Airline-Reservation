/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sweta Chowdhury
 */
public class FlightSchedule {
    
    
    private ArrayList<Flight> flightCatalog;
    
    public FlightSchedule(){
        flightCatalog = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightCatalog() {
        return flightCatalog;
    }

    public Flight addFlight(){
        Flight flight = new Flight();
        flightCatalog.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight flight){
        flightCatalog.remove(flight);
    }
    
    
    
}
