package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;

import L10_Exception_Handling.NonIntResultException;

public class Square {
    private int side;

    Square(int side){
        setSide(side);
    }
    private void setSide(int side){
        if(side > 0)
            this.side = side;
        else if (side < 0){
            throw new NegativeArraySizeException();
        }else System.out.println("The value is equal to default");
    }
    int getSide(){
        return side;
    }
    int calculateArea(){
        return side*side;

    }

}
