package Class26;

import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeUp = new TreeMap<>();
        makeUp.put("Lipsticks", 22.0);
        makeUp.put("BlushOn", 40.0);
        makeUp.put("Base", 50.0);
        makeUp.put("Foundation", 90.0);
        makeUp.put("EyeLiner", 25.5);
        makeUp.put("EyeLiner", 30.5);
        makeUp.put("Concealer", 35.5);
        var entries=makeUp.entrySet();
        for (var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());

        }
    }

}
