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
public class Airplane {
    private String airPlaneName;
    private int passengerCapacity;
    private double fuelConsumption;  
    private String modelNum;
    private long serialNum;
    
    private FlightSchedule flightSchedule;
    
    public Airplane(){
        flightSchedule = new FlightSchedule();
    }
   
    public String getAirPlaneName() {
        return airPlaneName;
    }

    public void setAirPlaneName(String airPlaneName) {
        this.airPlaneName = airPlaneName;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public int getTotalFlights(ArrayList<Flight> flightList) {
        return flightList.size();
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
    @Override
    public String toString(){
        return this.getAirPlaneName();
    }
   
    
}
