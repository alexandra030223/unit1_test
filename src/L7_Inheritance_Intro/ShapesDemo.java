package L7_Inheritance_Intro;
public class ShapesDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,3, "transparent");
        Triangle t2 = new Triangle(3,7,"colored");
        Rectangle r1 = new Rectangle(20,30);
        ColorTriangle ct1 = new ColorTriangle("red", "big", 12, 156);

        System.out.println("Info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area of t1: " + t1.area());

        System.out.println("Info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area of t2: " + t2.area());

        System.out.println("Info about r1: ");
        r1.showDim();
        System.out.println("Area of r1: " + r1.area());
        System.out.println("Is square: " + r1.isSquare());

//        System.out.println("Info about ct1: ");
//        ct1.showDim();
//        System.out.println("Area of ct1: " + ct1.area());
//        System.out.println("Color of ct1: " + ct1.getColor());
//        ct1.showColor();
    }
}
