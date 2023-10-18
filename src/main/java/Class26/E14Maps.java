package Class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class E14Maps {
    public static void main(String[] args) {
       //<String> means we will be storing the object of String class inside this set.
        Set<String> s=new LinkedHashSet<>();;
        Integer i =new Integer(10);
        String names=new String ("Nawaab");
        s.add(names);


        Set<ArrayList<String>>test=new LinkedHashSet<>();
        String name2="Wahaab";
        //test.add(name2);
        ArrayList<Integer>numbers=new ArrayList<>();
        Integer g=15;
        //test.add(numbers);
        ArrayList<String> j=new ArrayList<>();
        test.add(j);

    }
}
