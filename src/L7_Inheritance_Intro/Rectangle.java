package L7_Inheritance_Intro;

public class Rectangle extends TwoDimensionShape {
    Rectangle(double width, double height){
        super(width, height);
    }
    boolean isSquare(){
        return getWidth() == getHeight() ? true : false;
    }
    double area(){
        return getWidth() * getHeight();
    }
}
