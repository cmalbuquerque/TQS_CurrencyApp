

package tqs.homework.currencyapi;

import java.util.HashMap;

/**
 *
 * @author carolina albuquerque
 */

public class ConvertResponse{
    
    private static double result;
    private DataAPI data = new DataAPI();  
    private HashMap<String, Double> dt = data.getData();

    public double convert(double amount, String from, String to) {
        result = amount *(dt.get(to)/dt.get(from));         
        return result;
    }
    

    public HashMap<String, String> getList() {
        HashMap<String,String> currencies = new HashMap();
        for(String key : dt.keySet())
            currencies.put(key, key);
        return currencies;
    }
}
