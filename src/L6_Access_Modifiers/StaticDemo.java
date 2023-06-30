package L6_Access_Modifiers;

public class StaticDemo {
    int x;
    static int y;

    int sum(){
        return x + y;
    }
    static int yDiv(int number){
        if(number !=0) return y/number;
        return y/2;
    }
    static int oneDividesAnother(int n1, int n2){
        return n2==0? n1: n1/n2;
    }

    void iPrint(){
        System.out.println("I print");
    }
}
