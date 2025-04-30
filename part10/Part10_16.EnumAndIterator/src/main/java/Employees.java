
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    
    private List<Person> people;
    
    public Employees(){
        people = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        
        people.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        
        for(Person person: peopleToAdd){
            people.add(person);
        }
    }
    
    public void print(){
        
        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()){
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }        
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()){
            
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }             
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()){
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation().equals(education)){
                System.out.println(nextInLine);
            }
                    
        }
    }
    
}
