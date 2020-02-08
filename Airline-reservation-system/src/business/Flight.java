/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Sweta Chowdhury
 */
public class Flight {
    
    private String flightNumber;
    private int totalSeats;
    private int seatsOccupied;
    private Seat[][] seatsAvailable;
    private double flightRate;
    private double totalRate;
    private Airplane airplane;
    private String arrivalDate;
    private String arrivalTime;
    private String source;
    private String destination;
    private String departureDate;
    private String departureTime;
    private String flyTime;
    private int seatsRemaining;
        
  
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatsOccupied() {
        return seatsOccupied;
    }

    public void setSeatsOccupied(int seatsOccupied) {
        this.seatsOccupied = seatsOccupied;
    }

    public Seat[][] getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Seat[][] seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public double getFlightRate() {
        return flightRate;
    }

    public void setFlightRate(double flightRate) {
        this.flightRate = flightRate;
    }

    public double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(double totalRate) {
        this.totalRate = totalRate;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
    
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
   }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getFlyTime() {
        return flyTime;
    }

    public void setFlyTime(String flyTime) {
        this.flyTime = flyTime;
    }
    
    public int getSeatsRemaining() {
        return seatsRemaining;
    }

    public void setSeatsRemaining(int seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }
    
    @Override
    public String toString(){
        return this.getFlightNumber();
    }


    
    
}
