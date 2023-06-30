package L8_Inheritance;

public class OrderOfConstructorsDemo {
    public static void main(String[] args) {
//        C myC = new C();
//
//        X x = new X(5);
//        X x2;
//
//        Y y = new Y(10,4);
//
//        x2 = x;
//        System.out.println("x2.a: " + x2.a);
//        x2 = y;
//        System.out.println("x2.a: " + x2.a);
//
//        x2.a = 19;
////        x2.b = 27; x2 is ob type X, b is NOT an instance variable of class X.
//
//        Triangle t1 = new Triangle("contour", 8.0, 12.0);
//        Triangle t2 = new Triangle(t1);
//
//        System.out.println("\nInfo about t1: ");
//        t1.showStyle();
//        t1.showDim();
//        System.out.println("The area of t1 is " + t1.area());
//
//        System.out.println("\nInfo about t2: ");
//        t2.showStyle();
//        t2.showDim();
//        System.out.println("The area of t2 is " + t2.area());

        B objectOfB = new B(1,2,3);
        System.out.println(objectOfB);

        Sup objectOfSuperclass = new Sup();
        Sub1 objectOfSubclass1 = new Sub1();
        Sub2 objectOfSubclass2 = new Sub2();

        Sup superClassObjectReference;

        superClassObjectReference = objectOfSuperclass;
        superClassObjectReference.who();
        superClassObjectReference = objectOfSubclass1;
        superClassObjectReference.who();
        superClassObjectReference = objectOfSubclass2;
        superClassObjectReference.who();
    }
}
