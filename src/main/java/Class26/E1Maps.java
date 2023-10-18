package Class26;
/*Create a HashMap: A HashMap named fruit is created to store key-value pairs where the keys are
 strings (fruit names) and the values are doubles (prices).

Add Key-Value Pairs: Several key-value pairs are added to the fruit map.
 Note that the key "Apple" is added twice with different values. When you add a duplicate key,
  it will override the previous value associated with that key.

Retrieve Values by Key: The code uses various methods to retrieve values and perform checks on the map, including:

Printing the entire map using System.out.println(fruit).
Getting the size of the map using fruit.size().
Checking if the map contains a specific key (note that key comparison is case-sensitive) using fruit.containsKey("apple").
Checking if the map contains a specific value (e.g., 4.0 and 44) using fruit.containsValue(4.0) and fruit.containsValue(44).
Checking if the map is empty using fruit.isEmpty().
However, there are a couple of issues in your code:

The key "Apple" is added with different casing ("Apple" and "apple"). Note that HashMap keys are case-sensitive,
 so fruit.containsKey("apple") will return false in this case. To fix this, use consistent capitalization.

When checking for the key "apple," you should use the same capitalization as when you added it, which is "Apple."*/
import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        // creating map with <String , double> key value pairs
        HashMap<String,Double> fruit=new HashMap<String, Double>();
        // add key value pairs ro the map
        fruit.put("Apple",8.0);
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("kiwi",4.0);
        fruit.put("Apple",4.0); // Overrides the previous "Apple" entry

        //retrieves values by key

        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("apple"));
        System.out.println(fruit.containsValue(4.0));
        System.out.println(fruit.containsValue(44));
        System.out.println(fruit.isEmpty());


        }
    }

