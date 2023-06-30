package L6_Access_Modifiers;
import java.util.Scanner;
public class Dog {
        int age;
        String breed;
        private String name;
        char sex;
        boolean isHealthy;

    public Dog(int age, String breed, String name, char sex) {
        this.age = age;
        this.breed = breed;
        setName(name);
        this.sex = sex;
    }
        public Dog(int age, String breed, String name, char sex, boolean isHealthy) {
            this(age, breed, name, sex);
            this.isHealthy = isHealthy;
    }
    Dog(){
        age = 1;
        name = "unknown";
        sex = 'n';
        isHealthy = true;
    }
    private void setName(String name){
//        System.out.println("Enter new name: ");
//        Scanner in = new Scanner(System.in);
//        name = in.nextLine();
        if (name.length() >= 5){
            this.name = name;
        }else {
            System.out.println("Sorry, te name must be at least 5 symbols long, otherwise it wont be set. " +
                    "Try again.");
            this.name = "unknown";
        }
    }

    public String getName(){
        return name;
    }
}

