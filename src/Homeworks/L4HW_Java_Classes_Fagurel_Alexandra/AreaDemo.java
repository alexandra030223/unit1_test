package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;
public class AreaDemo {
    public static void main(String[] args) {
        Square square = new Square(-5);
        Square square1 = new Square(0);
        Square squareq = new Square(5);

        System.out.println("Area of square is: " + square.calculateArea());
        System.out.println("Area of square1 is: " + square.calculateArea());
        System.out.println("Area of square2 is: " + square.calculateArea());
    }
}
