package Class11;
//create a String if the String is not empty perform the following:
// if the String has an odd number of characters and has 3 or more characters,
//print the character in the middle of the String
public class T1StringMethod {
    public static void main(String[] args) {

        String str = "ada";

            if (str.length() % 2 != 0 && str.length() >= 3) {
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }
    }
