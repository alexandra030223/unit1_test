package L6_Access_Modifiers;

public class MyClass {
    private int alpha;
    public int beta;
    int gama;
    public void setAlpha(int a){
//        if(a<=10)
        alpha = a;
//        else System.out.println("Sorry, maximum value for alpha is 10. " +
//                "So this value has been set");
//        alpha = 10;
    }
    int getAlpha(){
        return alpha;
    }
}
