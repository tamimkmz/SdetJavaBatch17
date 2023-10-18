package Class29;

import java.util.Scanner;

public class E5Exceptions {
    public static void main(String[] args) {


        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("6");
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the size of array");
        try {
            //plan A
            int size = scanner.nextInt();
            int[] arr = new int[size];
        }catch(Exception Ahmed){
            //plan B
            System.out.println("User must only enter a positive number ");
        }
        System.out.println("8");
        System.out.println("7");
        System.out.println("9");
    }

}
