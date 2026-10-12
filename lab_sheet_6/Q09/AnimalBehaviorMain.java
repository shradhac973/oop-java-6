package lab_sheet_6.Q09;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    void sleep() {
        System.out.println("Lion rests in its den.");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger hunts and eats meat.");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in a sheltered area.");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer grazes on plants.");
    }

    @Override
    void sleep() {
        System.out.println("Deer rests in a quiet clearing.");
    }
}

public class AnimalBehaviorMain {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Tiger(), new Deer()};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}