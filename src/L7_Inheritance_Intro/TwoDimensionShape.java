package L7_Inheritance_Intro;

public class TwoDimensionShape {
    private double width;
    private double height;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    TwoDimensionShape(){
        width = height = 0.0;
    }
    TwoDimensionShape(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    void showDim(){
        System.out.println("Width and height: " + width + " & " + height);
    }
}
