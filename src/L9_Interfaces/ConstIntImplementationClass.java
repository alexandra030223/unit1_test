package L9;

public class ConstIntImplementationClass implements ConstInt{
    public static void main(String[] args) {
        int[] nums = new int[MAX];
        for(int i = MIN; i < 11;i++){
            if(i >= MAX) System.out.println(ERRMSG);
            else{
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
//        MAX = 11; ASSIGNMENT ERROR!
    }
}
