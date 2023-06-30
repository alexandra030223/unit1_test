package L9;

public class Duck implements Swimmable, Runnable{
    @Override
    public void runSlow() {
        System.out.println("I can run very slow!");
    }

    @Override
    public void runFast() {
        System.out.println("but if there is a danger I help myself with wings.");

    }

    @Override
    public void breathInTheAir() {
        System.out.println("Sure I can breath in the air.");

    }

    @Override
    public void swimSlow() {
        System.out.println("Usually I like to swim slow.");

    }

    @Override
    public void swimFast() {
        System.out.println("But if someone is chasing me I can easily swim faster!");

    }

    @Override
    public void breathInTheWater() {
        System.out.println("If I see something tasty I can keep my breath and it looks like I");

    }


}
