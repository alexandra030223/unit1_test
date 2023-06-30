package L6_Access_Modifiers;

public class Figure {
    public static double calculateAres(int a){
        return a * a;
    }
    public static double calculateAres(int a, int b){
        return a * b;
    }
    public static float calculateAresFloat(double a, double b){
        return (float)(a * b);
    }
}
