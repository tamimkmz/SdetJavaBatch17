package Review9;

import java.util.Scanner;

public class PrintTester {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print(20);// for weight
        p.print(10,20,30,45,50);// type casting
        p.print(10,20,50);//
        System.out.println();
        System.out.println(Math.abs(15));

        Scanner scanner=new Scanner(System.in);
        scanner.nextByte();
        scanner.nextByte(2);
        String str=String.valueOf(100);
        System.out.println(str);


    }
}
