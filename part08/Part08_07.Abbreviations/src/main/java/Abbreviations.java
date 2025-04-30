
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class Abbreviations {
    
    private HashMap<String, String> abbreviations = new HashMap<>();
    
    public Abbreviations(){
        
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation, explanation);
    }
    
    
    public boolean hasAbbreviation(String abbreviation){
        if(abbreviations.containsKey(abbreviation)){
            return true;
        }else{
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation){
       return abbreviations.get(abbreviation);
        
    }
}
