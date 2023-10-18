package Class24;
//Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
import java.util.ArrayList;

public class T1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Depali");
        names.add("Tamim");
        names.add("Giulia");
        names.add("Ahmed");
        names.add("Fahim");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Tamim"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
