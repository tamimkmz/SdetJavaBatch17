package Class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Depali")
        ;names.add("Tamim");
        names.add("Giulia");
        names.add("Ahmed");
        names.add("Fahim");
      //  names.remove(0);
        names.remove("Tamim");
        System.out.println(names);
        names.add(2,"Ehab");
        System.out.println(names);
        names.set(1,"Tammy");
        System.out.println(names);

    }
}
