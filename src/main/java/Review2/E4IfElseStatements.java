package Review2;

import java.util.Scanner;

public class E4IfElseStatements {
    public static void main (String[] args) {
        System.out.println("please enter the price of the item");
        Scanner scanner=new Scanner(System.in);
        double price=scanner.nextDouble();

        if(price>10000) {
            System.out.println("i can't buy this item");
        } else {
            System.out.println("lets buy this");
        }
    }
}
