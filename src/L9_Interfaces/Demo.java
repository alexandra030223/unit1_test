package L9;

public class Demo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());
        System.out.println("\nReset");
        ob.reset();

        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());
        System.out.println("\nStart value: 100");
        ob.setStart(-100);

        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());
        System.out.println("\nContinue");

        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());


        ByThrees ob1 = new ByThrees();
        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob1.getNext());
        System.out.println("\nReset");
        ob1.reset();

        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob1.getNext());
        System.out.println("\nStart value: 100");
        ob1.setStart(-100);

        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob1.getNext());
        System.out.println("\nContinue");

        for (int i =  0; i < 5; i++)
            System.out.println("Next value: " + ob1.getNext());

        Series obSeries;
        for (int i =  0; i < 5; i++){
            obSeries  = ob;
            System.out.println("Next value of obByTwos: " + obSeries.getNext());
            obSeries = ob1;
            System.out.println("Next value of obByThrees: " + obSeries.getNext());
        }
//public static void printFirstFive(ByTwos mySequence){
//
//        for (int i =  0; i < 5; i++){
//            System.out.println("Next value of obByThrees: " + mySequence.getNext());
//        }
        }
    }

