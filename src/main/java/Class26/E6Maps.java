package Class26;

import java.util.Collection;
import java.util.TreeMap;

public class E6Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeUp = new TreeMap<>();
        makeUp.put("Lipsticks", 22.0);
        makeUp.put("BlushOn", 40.0);
        makeUp.put("Base", 50.0);
        makeUp.put("Foundation", 90.0);
        makeUp.put("EyeLiner", 25.5);
        makeUp.put("EyeLiner", 30.5);
        makeUp.put("Concealer", 35.5);
        Collection<String> onlyKeys=makeUp.keySet();
        Collection<String> onlyValues=makeUp.keySet();
        System.out.println(onlyKeys);
        System.out.println(onlyValues);

        // makeUp.forEach((k,v)-> System.out.println(k+" "+v)); give us both key and valyes
        // makeUp.forEach((k,v)-> System.out.println(v));  give us only value
        //makeUp.forEach((k,v)-> System.out.println(k)); give us only key

        //whenever we need more than one parameter we need to put parenthesis
        //similarly if we want to have more than one line of code we need to have curly brackets aswell

       /* makeUp.forEach((k, v) -> {
            if (k.contains("a")) {
                System.out.println(v);
            }
        });*/
    }}
