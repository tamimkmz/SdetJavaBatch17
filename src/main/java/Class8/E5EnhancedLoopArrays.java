package Class8;


public class E5EnhancedLoopArrays {
    public static void main(String[] args) {
// find the largest even number.

        int [] nums ={10, 77, 23, 56, 25, 60, 45, 20};
      int largest =0;
      for(int d:nums){

          if(d>largest&& d%2==0){
              largest=d;
          }
       }
        System.out.println(largest);
    }
    }

