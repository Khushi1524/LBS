package oops;

abstract class Animal {
    abstract void makeSound();
    public void sleep(){
       System.out.println("Animal sleeping");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz!");
        super.sleep();
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); 
        dog.sleep(); 
    }
}
