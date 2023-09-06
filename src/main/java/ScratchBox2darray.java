
public class ScratchBox2darray {
    //Write a program that calculates the sum of elements from each row in a 2D array and
    // adds them into array of integers

        public static void main(String[] args) {
            int[][] a = {
                    {1, 1, 2}, //sum = 4
                    {3, 1, 2}, //sum = 6
                    {3, 5, 3}, //sum = 11
                    {0, 1, 2}  //sum = 3
            };
            for(int i =0;i<a.length;i++) {
                int [] rowArray = a[i];
                int sum =0;
                for(int j =0 ; j<rowArray.length;j++) {
                    //System.out.print(rowArray[j]);
                    sum +=rowArray[j];
                }

                System.out.print(sum);
                System.out.println();

            }
        }
    }

