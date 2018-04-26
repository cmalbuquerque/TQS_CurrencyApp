

package tqs.homework.currencyapi;

import java.util.HashMap;


public class ConvertResponse{
    
    private static double result;
    private DataAPI data = new DataAPI();  

    public double convert(double amount, String from, String to) {
      
        return result;
    }

    public HashMap<String, String> getList() {
        HashMap<String, Double> dt = data.getData();
        HashMap<String,String> currencies = new HashMap();
        for(String key : dt.keySet())
            currencies.put(key, key);
        return currencies;
    }
}
