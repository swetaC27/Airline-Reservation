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
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String address;
    private String dateOfBirth;
    private Seat seatBooked;
    private String passportNum;
    private long phoneNum;
    private double totalFlightCost;
    
    public Person(){
        seatBooked = new Seat();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Seat getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(Seat seatBooked) {
        this.seatBooked = seatBooked;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getTotalFlightCost() {
        return totalFlightCost;
    }

    public void setTotalFlightCost(double totalFlightCost) {
        this.totalFlightCost = totalFlightCost;
    }    
    

}
