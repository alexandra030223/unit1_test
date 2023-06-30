package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;

public class Finalize {
    class FDemo {
        int х;
        FDemo(int i) {
            х = i;
        }
        protected void finalizeMethod() {
            System.out.println("Финaлизaция " + х);
        }
    }
        void generator(int i) {
            FDemo o = new FDemo(i);
        }
        class FinalizeClass {
            public static void main(String args[]) {
                int count;
                Finalize obj = new Finalize();
                for (count = 1; count < 100000; count++)
                    obj.generator(count);
            }
        }
}

