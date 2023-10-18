package Class26;
//*Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
      //  Only print those countries which contain more than 5 letters in their country
       // name and the letter 'a' in their capital names*/
import java.util.TreeMap;

public class T3 {

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
        }}


