package L5_Classes;
public class Dog {
        int age;
        String breed;
        String name;
        char sex;
        boolean isHealthy;

    public Dog(int ageValue, String breedValue, String nameValue, char sexValue) {
        age = ageValue;
        breed = breedValue;
        name = nameValue;
        sex = sexValue;
    }
        public Dog(int ageValue, String breedValue, String nameValue, char sexValue, boolean isHealthyValue) {
            this(ageValue, breedValue, nameValue, sexValue);
            isHealthy = isHealthyValue;
    }
    Dog(){

    }
}

