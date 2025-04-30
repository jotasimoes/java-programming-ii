
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
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);        
    }
    
    public void clear(){
        history.clear();
    }
    
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        double max=0;
        if(history.size()>0){
            for(double value: history){
                if(value>max){
                    max=value;
                }
            }
            return max;
        }
        return max;
    }
    
    public double minValue(){
        double min;
        if(history.size()>0){
            min = history.get(0);
            for(double value: history){
                if(value<=min){
                    min=value;
                }
            }
            return min;
        }
        return 0;
    }
    
    public double average(){
        double sum=0;
        if(history.size()>0){
            for(double value: history){
                sum = sum + value;
            }
            
            return sum/history.size();
        }
        return 0;
    }
    
    
}
