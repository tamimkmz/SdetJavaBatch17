package Class8;


public class T4EnhancedLoopArrays {
    public static void main(String[] args) {


        int []nums ={10, 23, 56, 25, 45, 20};
        int largest= nums[2];
        for(int n:nums){
            if(n>largest){
                largest = n;
            }


   }
        System.out.println(largest);
    }
    }

