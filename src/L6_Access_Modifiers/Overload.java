package L6_Access_Modifiers;

public class Overload {
    public void sum(){
        System.out.println("No parameters passed");
    }
    public void sum(int a){
        System.out.println("With 1 parameter sum is equal  " + a);
    }
    public void sum(int a, int b){
        System.out.println("With 2 parameters sum is equal " + a + b);
    }
    public void sum(double a, double b){
        System.out.println("With 2 parameters sum is equal " + a + b);
    }
    public void sum(int a, int b, int c){
        System.out.println("With 3 parameters sum is equal " + (a + b + c));
    }
    public void sum(double d, int ... a){

        System.out.println("With n parameters sum is equal ");
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println("arg " + i + ": " + a[i]);
            sum +=a[i];
        }
        sum+=d;
        System.out.println("Sum is equal: " + sum);
    }
}
