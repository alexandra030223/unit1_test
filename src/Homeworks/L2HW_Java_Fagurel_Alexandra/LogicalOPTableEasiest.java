package Homeworks.L2;
public class LogicalOPTableEasiest {
    public static void main(String[] args){
        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;

        printLine(p,q);

        p = true;
        q= false;

        printLine(p,q);

        p = false;
        q = true;

        printLine(p,q);

        p = false;
        q = false;

        printLine(p,q);
    }
    public static void printLine(boolean p, boolean q){
        if(p) System.out.print(1);
        else System.out.print(0);
        System.out.print("\t");
        if (q)System.out.print(1);
        else System.out.print(0);
        System.out.print("\t");
        if(p&q) System.out.print(1);
        else System.out.print(0);
        System.out.print("\t");
        if (p|q) System.out.print(1);
        else System.out.print(0);
        System.out.print("\t");
        if (p^q) System.out.print(1);
        else System.out.print(0);
        System.out.print("\t");
        if (!p) System.out.print(1);
        else System.out.print(0);
        System.out.print("\t\n");
    }
}
