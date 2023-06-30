package L10_Exception_Handling;
public class UseFinally {
    public static void genException(int what){
        int i;
        int[] nums = new int[2];
        System.out.println("Received: " + what);
        try{
            switch (what) {
                case 0:
                    i = 10 / what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
                }
            }catch (ArithmeticException e){
            System.out.println("Attempt of division by zero.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The element is not found");
        }finally{
            System.out.println("Getting out from try");
        }
        }
    }

