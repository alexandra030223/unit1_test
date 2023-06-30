package L9;

public class MyClass implements B{
    @Override
    public void method1() {
        System.out.println("Implementation of the method1");

    }

    @Override
    public void method2() {
        System.out.println("Implementation of the method2");
    }

    @Override
    public void method3() {
        System.out.println("Implementation of the method3");
    }

    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.method1();
        ob.method2();
        ob.method3();
    }
}
