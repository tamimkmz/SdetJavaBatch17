package Review7;

public class StringOverview {
    public static void main(String[] args) {

        String phone="iphone";
       String color =new String();
       color="blue";

       String day=new String("Thursday");

       String sentence="    Today is september 7   ";
       int size=sentence.length();
        System.out.println(size);


      sentence= sentence.trim();// today is september 7
        System.out.println(sentence);

      String[] words=sentence.split(" ");// Inside of the word array is( today is september 7)
        System.out.println(words[3]);
        String modifiedNewString=sentence.replace("Today","tomorrow");
// replace date
        System.out.println(modifiedNewString);

        String str1="Hi Hi friends";//
        str1=str1.replace("Hi","Hello");
        System.out.println(str1);


        str1=str1.replaceAll("Hello","bye");
        System.out.println(str1);

char letter=str1.charAt(2);
        System.out.println(letter);

       int indexOfCharB= str1.indexOf("B");
        System.out.println(indexOfCharB);
         // Local variable is a block of code that are define inside the block or method.
        for (int i=10; i<12;i++){

        }
        // define ... why do we need them and why call them instance? to instantiate an object
    }
//Static variable: we don't need define inside of the class and can be access from outside of the class
}

