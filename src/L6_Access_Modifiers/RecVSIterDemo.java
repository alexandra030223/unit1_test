package L6_Access_Modifiers;

public class RecVSIterDemo {
    public static void main(String[] args) {

        System.out.println("Factorial of 5 via Iterative method" + RecursiveVSIterative.factorialCalcIterative(5));
        System.out.println("Factorial of 4 via Iterative method" + RecursiveVSIterative.factorialCalcIterative(4));
        System.out.println("Factorial of 3 via Iterative method" + RecursiveVSIterative.factorialCalcIterative(3));
        System.out.println("Factorial of 2 via Iterative method" + RecursiveVSIterative.factorialCalcIterative(2));

        System.out.println("Factorial of 5 via Recursive method" + RecursiveVSIterative.factorialCalcRecursive(5));
        System.out.println("Factorial of 4 via Recursive method" + RecursiveVSIterative.factorialCalcRecursive(4));
        System.out.println("Factorial of 3 via Recursive method" + RecursiveVSIterative.factorialCalcRecursive(3));
        System.out.println("Factorial of 2 via Recursive method" + RecursiveVSIterative.factorialCalcRecursive(2));
    }
}
