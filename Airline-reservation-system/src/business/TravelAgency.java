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
public class TravelAgency {

    private ArrayList<AirLiner> airlinerCatalog;
    private CustomerDirectory customerDirectory;
    private MasterFlightSchedule masterFlightSchedule;
    
    public TravelAgency() {
        airlinerCatalog = new ArrayList<AirLiner>();
        customerDirectory = new CustomerDirectory();
        masterFlightSchedule =  new MasterFlightSchedule();
    }

    public ArrayList<AirLiner> getAirlinerCatalog() {
        return airlinerCatalog;
    }

    public void setAirlinerCatalog(ArrayList<AirLiner> airlinerCatalog) {
        this.airlinerCatalog = airlinerCatalog;
    }

    public AirLiner addAirliner() {
        AirLiner airliner = new AirLiner();
        airlinerCatalog.add(airliner);
        return airliner;
    }
    
    public void deleteAirliner(AirLiner airline){
        airlinerCatalog.remove(airline);
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public MasterFlightSchedule getMasterFlightSchedule() {
        return masterFlightSchedule;
    }

    public void setMasterFlightSchedule(MasterFlightSchedule masterFlightSchedule) {
        this.masterFlightSchedule = masterFlightSchedule;
    }
    
    

}
