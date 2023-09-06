package Review3;

import java.util.Scanner;

public class E7DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        int x=1;
        int sum=0;
        do {

            System.out.println("please enter the price of item or -1 to terminate");
            x=scanner.nextInt();
            if(x!=-1){
            sum=sum+x;}
            System.out.println("Your totall bill is "+sum);

        }while(x!=-1);
    }
}
