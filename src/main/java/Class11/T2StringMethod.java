package Class11;
//create a String and print it in reverse order(Sunday->yadnuS).
public class T2StringMethod {
    public static void main(String[] args) {

        String str =" Sunday";
        //System.out.println("yadnaS");
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
           // System.out.print(str.charAt(i));
        }

        System.out.println(reversed);

        }
    }
