package L8_Inheritance;

public class Triangle extends TwoDShape{
    private String style;

    Triangle(){
        super();
        style = "none";
    }
    Triangle(String style, double width, double height){
        super(width, height);
        this.style = style;
    }
    Triangle(double dimension){
        super(dimension);
        style = "colored";
    }
    Triangle(Triangle object){
        super(object);
        style = object.style;
    }
    double area(){
        return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("The triangle is " + style);
    }
}
