package Class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        long startingTime=System.currentTimeMillis();
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0; i<100000;i ++){
            numbers.add(0,1);

        }

long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);
    }
}
