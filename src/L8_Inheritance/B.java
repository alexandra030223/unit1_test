package L8_Inheritance;

public class B extends A{
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    @Override
    public String toString() {
        return "B{" +
                "k=" + k +
                ", i=" + i +
                ", j=" + j +
                '}';
    }
}
