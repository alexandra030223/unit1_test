package L7_Inheritance_Intro;

public class Rectangle extends TwoDimensionShape {
    Rectangle(double width, double height){
        super(width, height);
    }
    boolean isSquare(){
        return getWidth() == getHeight() ? true : false;
    }

    @Override
    double area(){
        return getWidth() * getHeight();
    }
//    @Override
//    void showDim(){
//        System.out.println("Width and height: " + getWidth() + " & " + getHeight() + "WARNING!");
//    } MUST NOT OVERRIDE FINAL METHOD!
}

