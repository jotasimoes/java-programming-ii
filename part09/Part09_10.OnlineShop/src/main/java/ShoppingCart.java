
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class ShoppingCart {
    
    private Map<String, Item> items;
    
    public ShoppingCart(){
        items = new HashMap();
    }
    
    public void add(String product, int price){
         if (items.containsKey(product)) {
        
        items.get(product).increaseQuantity();
    } else {
       
        items.put(product, new Item(product, 1, price));
    }
    }
    
    public int price(){
        int totalPrice=0;
        for(Item item : items.values()){
            totalPrice = totalPrice + item.price();
        }
        
        return totalPrice;
    }
    
    public void print(){
        for(Item item: items.values()){
            System.out.println(item);
        }
    }
    
}
