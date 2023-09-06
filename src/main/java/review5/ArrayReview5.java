package review5;



public class ArrayReview5 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int rowTotal=0;
        for(int i =0; i<a.length;i++){
            rowTotal+=a[1][i];
        }
        //  System.out.println(rowTotal);
        int total=sum(a);
        System.out.println(total);
    }
    public static int sum(int[][]values){
        int total=0;
        for(int i=0; i<values.length; i++){
            for(int j=0; j<values.length;j++)
                total+=values[i][j];
        }

        return total;
    }
}


