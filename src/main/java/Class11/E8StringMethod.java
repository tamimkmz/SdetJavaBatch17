package Class11;

public class E8StringMethod {
    public static void main(String[] args) {

        String str=" Hi there how are you. i am good. I am Driving";
        str.split("[.]");
        String [] strs=str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[0]); // it give you choice to which sentence come next.
       System.out.println(strs[1].trim());




        }
    }
