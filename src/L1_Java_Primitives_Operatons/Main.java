package L1_Java_Primitives_Operatons;

public class Main {
    public static void main(String[] args) {
        System.out.println("Integer primitives:");
        byte b = 8;
        short s = 16;
        int i; //declaring variables
        i = 32; //initializing variable
        long l = 64;
        System.out.println("Variables of type 'byte' store"+b+ "bits.\n " +
                "Diapason from -128 to 127");
        System.out.println("Variables of type 'short' store"+ s+ "bits.\n " +
                "Diapason from -32768 to 32767");
        System.out.println("Variables of type 'int' store"+i+ "bits.\n " +
                "Diapason from -2147483648 to 2147483647");
        System.out.println("Variables of type 'long' store"+l+ "bits.\n " +
                "Diapason from -......... to ..........");

        System.out.println("Floating point primitives");
        System.out.println("Variables of type 'float' store 32 bits.");
        System.out.println("Variables of type 'double' store 64 bits.");

        char c;
        c = 'X';
        System.out.println("Variable c contains" + c);
        System.out.println("Initial value of variable i = " + c);
        c +=1;
        System.out.println("Initial value of variable i = " +c);
        c++;
        System.out.println("Initial value of variable i = " +c);

        boolean boo;
        boo = true;
        boo = false;
        System.out.println("b+s="+(b+s));
        System.out.println("b+s="+(127+16));




    }
}