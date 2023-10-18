package Class26;
//Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
     //   Print all keys and values from a country map using for each loop or Lambda.
     //   Print all values from a country map using for each loop or Lambda.
import java.util.TreeMap;

public class T2 {

        public static void main(String[] args) {
            // Create a TreeMap to store countries and capitals
            TreeMap<String, String> countryMap = new TreeMap<>();

            // Add countries and capitals to the map
            countryMap.put("USA", "Washington, D.C.");
            countryMap.put("Canada", "Ottawa");
            countryMap.put("India", "New Delhi");
            countryMap.put("Germany", "Berlin");
            countryMap.put("Australia", "Canberra");;
            // Print values from the country map using a for-each loop
           System.out.println("Countries and Capitals:");
            for (String capital : countryMap.values()) {
               System.out.println(capital);
            }
        }}


