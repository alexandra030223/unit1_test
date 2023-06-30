package L6_Access_Modifiers;
public class AccessDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.setAlpha(6);

        obj.beta = 10000;
        obj.gama = 10000;

        System.out.println(obj.getAlpha());

        var myDog = new Dog();
        var myDog1 = new Dog(2, "foxterier", " ", 'f');
//        System.out.println("Default name was: " + myDog.getName());
//
//        myDog.setName();
//
//        System.out.println("After the change the name is: " + myDog.getName());
        System.out.println("MyDog1 the name is: " + myDog1.getName());
    }
}
