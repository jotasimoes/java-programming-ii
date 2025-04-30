
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BLC3
 */
public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap();
        this.stocks = new HashMap();
    }

    public void addProduct(String product, int price, int stock) {

        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (prices.keySet().contains(product)) {
            return prices.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (stocks.keySet().contains(product)) {
            return stocks.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (stocks.containsKey(product)) {
            int stockRemaining = (stocks.get(product) - 1);

            if (stockRemaining < 0) {
                return false;
            }

            if (stockRemaining == 0) {
                stocks.replace(product, stockRemaining);
                return true;
            }

            stocks.replace(product, stockRemaining);
            return true;
        }

        return false;

    }
    
    public Set<String> products(){
        return prices.keySet();
    }
}
