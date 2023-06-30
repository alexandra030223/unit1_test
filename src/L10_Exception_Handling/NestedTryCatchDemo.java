package L10_Exception_Handling;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + "/" + denom[i] + " = " + num[i] / denom[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero attempt!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Corresponding element not found!");
            System.out.println("Fatal error - app interrupted.");
        }
        System.out.println("THE TRUTH IS IT CAN CONTINUE IT THERE ARE MORE LINES OF CODE");
    }
}