
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
public class TodoList {
    
    private ArrayList<String> tasks=new ArrayList<String>();
    
    public TodoList(){
        
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        for(int i=0;i<tasks.size();i++){
            System.out.println((i+1)+": "+tasks.get(i));
        }
    }
    
    public void remove(int number){
        this.tasks.remove(number-1);
    }
}
