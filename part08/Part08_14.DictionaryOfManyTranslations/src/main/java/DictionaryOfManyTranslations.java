
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> traducoesAdicionadas = this.translations.get(word);
        traducoesAdicionadas.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> traducoes = new ArrayList<>();
        
        if(this.translations.containsKey(word)){
           traducoes = this.translations.get(word); 
           return traducoes;
        }else{
            return traducoes;
        }
    }
    
    public void remove(String word){
        ArrayList<String> traducoes = new ArrayList<>();
        if(this.translations.containsKey(word)){
           this.translations.remove(word);
           
           
        }
    }
}
