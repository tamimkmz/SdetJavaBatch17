package Class24;
//Create an arrayList of words. Remove every word that ends with “e”.
import java.util.ArrayList;

public class T4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();// ArrayList can shift its indexes when we operate
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("T.V");

       /* for (int i=0;i<words.size();i++){
            if (words.get(i).endsWith("e")){

                words.remove(i);
                i--;
            }
        }*/
        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);

    }
}