import java.util.Scanner;

public class ScratchBox2 {

        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your name");
            String name=scanner.nextLine();

            Scanner input=new Scanner(System.in);
            System.out.println("Enter your mobile number");
            String mobileNumber=input.nextLine();

            Scanner scanner1=new Scanner(System.in);
            System.out.println("Enter your age");
            String age=scanner1.nextLine();
            System.out.println("Your name is " +name+ ", your age is " +age+ " and your mobile number is " +mobileNumber);

    }
}

