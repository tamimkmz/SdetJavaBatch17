package Class5;

import java.util.Scanner;

public class PracticeOfOperator {
    public static void main (String[] args) {

        int day=7;
        if(day>=1 && day<=5) {
            System.out.println("it is a week day");
        }else if (day==6|| day==7) {
            System.out.println("it is a weekend");
        }else{
            System.out.println("invalid day");
        }



    }
}
