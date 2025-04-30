
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate ,String> registos;
    
    public VehicleRegistry(){
        this.registos = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){
        
        if(!registos.containsKey(licensePlate)){
            registos.put(licensePlate, owner);
            return true;
        }else{
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate){
        if(registos.get(licensePlate) != null){
            return registos.get(licensePlate);
        }
        else{
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(registos.containsKey(licensePlate)){
            registos.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licenseplate: registos.keySet()){
            System.out.println(licenseplate);
        }  
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: registos.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }            
        }  
        
        for(String owner: owners){
            System.out.println(owner);
        }
    }
}
