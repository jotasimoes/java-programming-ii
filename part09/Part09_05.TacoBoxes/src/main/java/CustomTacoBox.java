/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class CustomTacoBox implements TacoBox{
    
    private int tacos;
      
    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        if(this.tacos -1 <0){
            this.tacos =0;
            return this.tacos;
        }
       return this.tacos;
    }

    @Override
    public void eat() {
        this.tacos = this.tacos-1;
    }
    
}
