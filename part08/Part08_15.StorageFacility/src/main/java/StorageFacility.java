
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.storage.containsKey(unit)) {
            this.storage.put(unit, new ArrayList<String>());
        }
        this.storage.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.storage.containsKey(storageUnit)) {
            return new ArrayList<String>();
        }
        return new ArrayList<String>(this.storage.get(storageUnit));

    }
    
    public void remove(String storageUnit, String item){
        if(this.storage.containsKey(storageUnit)){
            this.storage.get(storageUnit).remove(item);
        }
        else{
            return;
        }
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
        
    }
    
    public ArrayList<String> storageUnits(){
        
        ArrayList<String> storageUnits = new ArrayList<>();
        
        for(String storageUnit: this.storage.keySet()){
            if(!this.storage.get(storageUnit).isEmpty()){
                storageUnits.add(storageUnit);
            }
        }
        
        return storageUnits;
    }

}
