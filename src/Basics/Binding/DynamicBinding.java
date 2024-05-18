package Binding;

class Pet {
    public void jump() {
        System.out.println("Pet is Jumping....");
    }
}

class Dog extends Pet {
    @Override
    public void jump() {
        System.out.println("Dog is Jumping....");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.jump();
    }
}
