package L5_Classes;
public class TernaryDemo {
    public static void main(String[] args){
//        condition? statement1: statement2
        System.out.println(absoluteValue(8));
        System.out.println(absoluteValue(-18));
    }
    public static int absoluteValue(int number){
        int absoluteValue;
        absoluteValue = number < 0?- number:number;

//        if (number < 0) absoluteValue = -number;
//        else absoluteValue = number;

        return absoluteValue;
    }
}
