package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E12Maps{
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("lipsticks",20.99);
        makeup.put("BlushOn",24.99);
        makeup.put("base",50.99);
        makeup.put("foundation",50.99);
        makeup.put("Eyeliner", 25.99);
        makeup.put("Eyeliner", 25.99);
        makeup.put("concealer",51.99);
        Set<Map.Entry<String,Double>> entries=makeup.entrySet();
        for (Map.Entry<String,Double> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
        }
