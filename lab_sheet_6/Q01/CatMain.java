package lab_sheet_6.Q01;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        // This exercise specifically asks the Cat override to bark.
        System.out.println("Bark");
    }
}

public class CatMain {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}