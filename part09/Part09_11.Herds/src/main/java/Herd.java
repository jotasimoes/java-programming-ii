
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class Herd implements Movable{

    private List<Movable> movables;
    
    
    public Herd(){
        this.movables = new ArrayList();
    }
    
    public void addToHerd(Movable movable){
        movables.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable: movables){
            movable.move(dx, dy);
        }
    }
    
    public String toString(){
        String herd = "";
        
        for(Movable movable: movables){
            herd = herd + movable.toString() + "\n";
        }
        
        return herd;
    }
    
}
