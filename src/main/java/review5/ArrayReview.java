package review5;




public class ArrayReview {
    public static void main(String[] args) {
        int a = 10;
        int[] array = {10, 11, 12, 13, 55, 34, 24};
        ;
        int numberOfElement = array.length;
        System.out.println(numberOfElement);
        System.out.println(array[3]);// getting 1 element from an array
        /* when to use for loop - when we want to repeat a block of code that we know the number of iterations.
         it also itterate as long as our code is true
        or when we know how many times we want to repeat or iterate the code - for loop or enhanced for loop
        when we do not know the exact number of iterations. then java tell us use while or do while loops
        while checks the condition first. Do while opposite it.
        we use enhance for loop Only with arrays or collections
*/
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
 /*    enhanced for/ for each loop/ advanced for --- loop syntax
 for(DataTypeofElement anyVariableName:NameofTheDataStructure){
                    } or
            //*      for( DataTypeofElement anyVariableName:NameDataofTheDataStructure){
    // }*/

            // int []array={10, 11, 12, 13, 14, 15, 25}; enhance loop works arrayData or collections rather than index variable
            // int[] array={10, 11, 12, 13, 55, 34, 24};
            for (int ar : array) {
                System.out.println(ar);
            }
        }


    }}