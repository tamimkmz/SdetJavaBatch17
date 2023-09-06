package Class8;


public class T6EnhancedLoopArrays {
    public static void main(String[] args) {
// find the smallest number in this array> expected answer is 10
        int[] nums = {10, 77, 23, 56, 60, 25, 45, 20, - 10, -5};
        int smallest = nums [0];
        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            }
        }
            System.out.println(smallest);
        }
    }

