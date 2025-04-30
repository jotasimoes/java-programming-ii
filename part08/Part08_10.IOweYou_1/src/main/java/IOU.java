
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class IOU {
    
    private HashMap<String, Double> dividas = null;
    
    public IOU(){
       dividas = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
      dividas.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
      if(this.dividas.containsKey(toWhom)){
          return this.dividas.get(toWhom);
      }
      return 0;
    }
}
