package Homeworks.L5HW_Java_Arrays_Fagurel_Alexandra;
public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;
        nums[0] = 0;
        nums[1] = 10;
        nums[2] = 563;
        nums[3] = 268;
        nums[4] = -864;
        nums[5] = 1520;
        nums[6] = 698;
        nums[7] = 0;
        nums[8] = 568;
        nums[9] = 75;
        min = max = nums[0];
        for(int v : nums) {
            if(v < min) min = v;
            if(v > max) max = v;
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
