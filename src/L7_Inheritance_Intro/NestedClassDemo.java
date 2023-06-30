package L7_Inheritance_Intro;

import L6_Access_Modifiers.Overload;

public class NestedClassDemo {
    public static void main(String[] args) {
        int[] x = {3, 12, 45, -7, 8 ,24};
        Outer outerOb = new Outer(x);
        outerOb.analyze();

        Overload myClassObj = new Overload();
        double n = 15;
        myClassObj.sum(n, 2,3,4,5);

    }
}
