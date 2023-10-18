package Class26;
//Create a map of a building. Store floor number and its associated company name.
// (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
//
//1
import java.util.HashMap;
import java.util.Map;

public class T1 {

        public static void main(String[] args) {

            Map<Integer, String> building = new HashMap<>();


            building.put(1, "Google");
            building.put(2, "Syntax");
            building.put(3, "Amazon");
            building.put(4, "Microsoft");
            building.put(5, "Apple");
            building.put(6, "Facebook");
            building.put(7, "Google"); // Duplicate key
            System.out.println(building);

            System.out.println("Number of entries in building : " + building.size());
            building.put(4, "Oracle");
            System.out.println("\nBuilding map after updating the 4th floor:");
            for (Map.Entry<Integer, String> entry : building.entrySet()) {
                System.out.println("Floor " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }

