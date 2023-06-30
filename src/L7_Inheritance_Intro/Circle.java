package L7_Inheritance_Intro;

public class Circle extends TwoDimensionShape{
    int rad;
    final double PI = 3.14;
    @Override
    double area() {
        return rad * rad * PI;
    }
}
