
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight=0;
       for(Item itemGuardado: items){
           totalWeight=totalWeight+itemGuardado.getWeight();
       }
       
       if(totalWeight+item.getWeight() <= capacity){
           items.add(item);
       }else{
           return;
       }
    }

    @Override
    public boolean isInBox(Item item) {
          return items.contains(item); 
    }
    
    
    
    
    
}
