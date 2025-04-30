
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand>{
    
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card card){
        
        cards.add(card);
    }
    
    public void print(){
        for(Card card: cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        
        Collections.sort(cards);        
    }

    @Override
    public int compareTo(Hand hand) {
        
        return this.getValue() - hand.getValue();
    }
    
    public int getValue(){
        int soma = 0;
        
        for(Card card: cards){
            soma = soma + card.getValue();
        }
        
        return soma;
    }
    
    public void sortBySuit(){
        
        Collections.sort(cards, new BySuitInValueOrder());
        
        cards.forEach(card -> System.out.println(card));
    }
    
    
    
    
}
