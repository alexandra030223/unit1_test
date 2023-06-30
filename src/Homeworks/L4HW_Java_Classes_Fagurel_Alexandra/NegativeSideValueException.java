package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;

public class NegativeSideValueException extends Exception{
    int n;
    NegativeSideValueException(int num){
        n = num;
    }

    @Override
    public String toString() {
        return "NegativeSideValueException: " + n + " is negative and cannot be set as side.";
    }
}
