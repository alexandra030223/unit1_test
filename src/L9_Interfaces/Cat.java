package L9;

public class Cat implements Runnable{
    @Override
    public void runSlow() {
        System.out.println("I am running slow");

    }

    @Override
    public void runFast() {
        System.out.println("I am running fast");
    }

    @Override
    public void breathInTheAir() {
        System.out.println("I can breath");

    }
}
