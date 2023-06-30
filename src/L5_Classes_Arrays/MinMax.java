package L5_Classes_Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] nums = {99, -9, 198989, 979, -990, 2, 27, 14, 0, 3};

        int min, max;
        min = max = nums[0];

        for(int i = 1; i<10; i++){
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Minimun is " + min);
        System.out.println("Maximum is " + max);
    }
}
