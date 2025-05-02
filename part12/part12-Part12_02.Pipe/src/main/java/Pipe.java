
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class Pipe<T> {
    
    private ArrayList<T> values;
    
    public Pipe(){
        values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        values.add(value);
        
    }
    
    public T takeFromPipe(){
        
        if(values.isEmpty()){
            return null;
        }
        
        
        T takenValue = values.get(0);
        
        values.remove(0);
        return takenValue;
    }
    
    public boolean isInPipe(){
        
        if(values.isEmpty()){
            return false;
        }
        
        else{
            return true;
        }
    }
    
}
