/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sweta Chowdhury
 */
public class MasterFlightSchedule {
    
    private ArrayList<AirLiner> airlinerList;
    
    public ArrayList<AirLiner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<AirLiner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
    
   
    
//    private ArrayList<FlightSchedule> mfs;
//    
//    public MasterFlightSchedule(){
//        mfs = new ArrayList<FlightSchedule>();
//    }
//
//    public ArrayList<FlightSchedule> getMfs() {
//        return mfs;
//    }   
//    
//    public FlightSchedule addSchedule(){
//        FlightSchedule fs = new FlightSchedule();
//        mfs.add(fs);
//        return fs;
//    }
//    
//    public void deleteSchedule(FlightSchedule fs){
//        mfs.remove(fs);
//    }
//    
//    public HashMap<String, ArrayList<Flight>> searchMasterSchedule(String from, String to, String timeOfDay){
//        HashMap<String, ArrayList<Flight>> resultmap = new HashMap<String, ArrayList<Flight>>();               
//        for(FlightSchedule fs: mfs){
//            //ArrayList<Flight> resultPerAirliner = fs.searchFlight(from, to, timeOfDay);
////            String name =fs.getAirlinername();
////            if(!resultPerAirliner.isEmpty()){
////                resultmap.put(name, resultPerAirliner);
////            }            
//        }        
//        return resultmap;
//    }    
//    

  
    
}
