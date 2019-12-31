package kata2;

import java.util.Map;
import kata2.Histogram;

public class Kata2 {
    public static void main(String[] args) {
        Histogram histo = new Histogram(new int[]{1, 2, 1, 4, 1, 3, 4, 5, 7, 9, 1, 2, 5, 3, 4});
        Map<Integer,Integer> histogr = histo.getHistogram();
            
        for (int key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }  
}
        