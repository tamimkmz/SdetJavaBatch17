package Review3;

public class S2Logicaloperators {
    public static void main(String[] args) {
        boolean isMeat=false;
        boolean isEgg=true;
        boolean isFish=false;
        boolean milk=false;
        boolean veggetables=true;
        boolean isProtein=isEgg || isMeat || isFish;
        boolean isGoodDiet=(isEgg || isMeat || isFish) && milk && veggetables;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);


    }
}
