package Class11;

public class E2StringMethod {
    public static void main(String[] args) {
// write code that will count how many times thew letter a has appeared in the string
        String str = "Batch 17 is A great batch. Just Kidding. Please don't take it seriously";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='t' || str.charAt(i)=='T') {
                count++;

            }
            }
            System.out.println(count);

        }
    }
