package Class29;

public class E6Exceptions {
    public static void main(String[] args) {
        System.out.println("1");


try {
    //place the code that might throw an exception
    // System.out.println(10/0);
            /*String name=null;
            name.length();*/
    String name = null;
    name.length();
    int[] arr = new int[-5];
} catch(ArithmeticException e){
        System.out.println(" Don't divide by zero");
    }
  catch(NullPointerException e){
        System.out.println("check if you stored value in the variable");
    }catch(Exception e){
        System.out.println("something went wrong");
    }

}
}






