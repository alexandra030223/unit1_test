package L5_Classes_Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayClass {
    public static void main(String[] args) {
        int[] intArray;
        int[] intArray1 = new int[20];
        int[] intArray2 = {1, 2, 3, 4, 555};
        int[] intArray3 = new int[]{1, 2, 3, 4, 555};

        int[] orderedArray = orderArray();
        showArray(orderedArray);

        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i]=111;
            System.out.print(intArray2[i] + " ");
        }
        for (int arrayElement : intArray2) {
            System.out.println(arrayElement);
        }
        for (int arrayElement : intArray2) {
            arrayElement=111;
        }
        for (int arrayElement : intArray2) {
            System.out.println(arrayElement);
        }
    }
    static void showArray(int [] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void showArrayDetailed(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i] + " ");
        }
        System.out.println();
    }

    static void populateArray(int[] arr){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter the element[" + i + "]:");
            arr[i]= in.nextInt();
        }
    }
    static void populateArrayRandomly(int[] arr){
        Random r = new Random();
        for (int i = 0; i< arr.length; i++){
            arr[i]= r.nextInt(1000);
        }
    }

    static void populateArrayRandomlyInRange(int[] arr, int  min, int max){

        for (int i = 0; i< arr.length; i++){
            arr[i]= (int)(Math.random()*(max-min+1)+min);
        }
    }
    static int[] orderArray() {
        int size, min, max;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimension of the array: ");
        size = in.nextInt();
        System.out.println("Enter the minimum value of the array element: ");
        min = in.nextInt();
        System.out.println("Enter the maximum of the array element: ");
        max = in.nextInt();
        int[] values = new int[size];
        populateArrayRandomlyInRange(values, min, max);
        return values;
    }
}
