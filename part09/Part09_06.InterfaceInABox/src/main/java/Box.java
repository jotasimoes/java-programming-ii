
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity){
        items = new ArrayList<>();
        this.capacity = capacity;
        
    }
    
    public void add(Packable item){
        if(item.weight()+ weight() <= this.capacity){
             items.add(item);
        }
        System.out.println("Box cant handle that much weight!");
    }
    
    public double weight(){
        double totalWeight=0;
        
        for(Packable item: items){
            totalWeight = totalWeight + item.weight();
        }
        
        return totalWeight;
    }
    
    //Box: 6 items, total weight 4.0 kg
    
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
