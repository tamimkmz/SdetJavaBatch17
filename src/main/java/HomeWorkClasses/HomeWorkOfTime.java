package HomeWorkClasses;

import java.util.Scanner;

public class HomeWorkOfTime {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please input the current time");
        double time=scanner.nextDouble();
       if (time>=10 && time<13){
           System.out.println("It is morning");
       }else if(time>=13 && time<=14) {
           System.out.println("it is afternoon");
       }else if(time>=16 && time<=17) {
           System.out.println("It is evening");
       }else if (time>=21 && time<=24) {
           System.out.println("It is night");
       }else{
           System.out.println(" invalid time");
       }


    }
}
