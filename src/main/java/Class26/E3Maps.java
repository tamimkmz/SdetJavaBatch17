package Class26;

import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
       TreeMap<String,Double> fruit=new TreeMap<String, Double>();
        fruit.put("Apple",8.0);// override
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("kiwi",4.0);
        fruit.put("Apple",4.0);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("apple"));
        System.out.println(fruit.containsValue(4.0));
        System.out.println(fruit.containsValue(44));
        System.out.println(fruit.isEmpty());


        }
    }

