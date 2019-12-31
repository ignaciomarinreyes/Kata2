package kata2;

import java.util.Map;
import kata2.Histogram;

public class Kata2 {
    public static void main(String[] args) {
        
        Histogram histo = new Histogram(new String[]{"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"});
        Map<String,Integer> histogr = histo.getHistogram();
            
        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }  
}