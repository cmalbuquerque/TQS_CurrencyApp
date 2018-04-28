package tqs.homework.currencyapi;

//necessary components are imported
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author carolina albuquerque
 */


public class DataAPI{
	
    // Code from the documentation example
    // essential URL structure is built using constants 
    public static final String ACCESS_KEY = "62075c362bd52b0c53647304152e57e4";
    public static final String BASE_URL = "http://apilayer.net/api/";
    public static final String ENDPOINT = "live";
    public static final String FORMAT = "1";
    
    
    public static double result;
    
    // this object is used for executing requests to the (REST) API
    static CloseableHttpClient httpClient = HttpClients.createDefault();
    
    public HashMap<String, Double> getData() {
        
        HashMap<String,Double> listExchange = new HashMap<>();
        // The following line initializes the HttpGet Object with the URL in order to send a request
        HttpGet get = new HttpGet(BASE_URL + ENDPOINT + "?access_key=" + ACCESS_KEY + "&format=" + FORMAT);
        try {
            CloseableHttpResponse response =  httpClient.execute(get);
            HttpEntity entity = response.getEntity();

            // the following line converts the JSON Response to an equivalent Java Object
            JSONObject exchangeRates = new JSONObject(EntityUtils.toString(entity));
            JSONObject quotes = exchangeRates.getJSONObject("quotes");

            Iterator jsonList = quotes.keys();

            while(jsonList.hasNext()){
                String s = jsonList.next().toString().replace("USD", "");
                if(!s.equals(""))
                    listExchange.put(s,quotes.getDouble("USD"+s));
            }
            listExchange.put("USD", 1.0);
            
            response.close();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return listExchange;
    }

}