package L9;

public class DemoAnimals {
    public static void main(String[] args) {
        Cat randomCat = new Cat();
        Fish randomFish = new Fish();
        Duck randomDuck = new Duck();

        whatCanIDoInTheWater(randomDuck);
        whatCanIDoInTheWater(randomFish);
        whatCanIDoOnTheEarth(randomCat);
        whatCanIDoOnTheEarth(randomDuck);
    }
    public static void whatCanIDoInTheWater(Swimmable n){
        System.out.println("\nI am  " + n);
        n.swimSlow();
        n.swimFast();
        n.breathInTheWater();
    }
    public static void whatCanIDoOnTheEarth(Runnable n){
        System.out.println("\nI am  " + n);
        n.runSlow();
        n.runFast();
        n.breathInTheAir();
    }
//    public static void printInfo(Animal n){

    }


