package Review6;
// anything it is out side of the block is it instance code// and inside the method called local
public class S1StringMethod {
    public static void main(String[] args) {
        String userName="tamim123";
       // String s= new String("userName123");
        System.out.println(userName.length());
        int len=userName.length();
        if (len<8){
            System.out.println("too short for a userName");

        }


    }
}
