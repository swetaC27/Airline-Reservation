/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class AirLiner {
    private String airLinerName;
    private String manufacturer;
    private String establishmentDate;
    private int fleet;
    private FlightSchedule flightSchedule;     
    private ArrayList<Airplane> airplaneCatalog;
    
    public AirLiner(){
        airplaneCatalog = new ArrayList<Airplane>();
    }
     
    public String getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate;
    }
     
    public String getAirLinerName() {
        return airLinerName;
    }

    public void setAirLinerName(String airLinerName) {
        this.airLinerName = airLinerName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

     
    public ArrayList<Airplane> getAirplaneCatalog() {
        return airplaneCatalog;
    }

    public void setAirplaneCatalog(ArrayList<Airplane> airplaneCatalog) {
        this.airplaneCatalog = airplaneCatalog;
    }
    
    public Airplane addAirplane(){
        Airplane airplane = new Airplane();
        airplaneCatalog.add(airplane);
        return airplane;
    }
    
    public void deleteAirplane(Airplane airplane){
        airplaneCatalog.remove(airplane);
    }

    public int getFleet() {
        return fleet;
    }

    public void setFleet(int fleet) {
        this.fleet = fleet;
    }
    
    
    @Override
    public String toString(){
        return this.getAirLinerName();
    }
    
}
