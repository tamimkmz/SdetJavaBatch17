package Review3;
import java.util.Scanner;

public class Task1LogicalOperators {
    public static void main(String[] args) {
    Scanner scanner=new Scanner("please enter first boolean value true/false");
        boolean var1=scanner.nextBoolean();
        System.out.println("please enter second boolean value true/false");
        boolean var2=scanner.nextBoolean();
        if(var1&&var2){
            System.out.println("Both values are true");
        }else{
            System.out.println("Both values are not true");
        }
    }

}
