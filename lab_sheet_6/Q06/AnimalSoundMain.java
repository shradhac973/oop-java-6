package lab_sheet_6.Q06;

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion: Roar!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger: Grrr!");
    }
}

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}