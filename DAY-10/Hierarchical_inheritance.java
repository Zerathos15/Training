class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class single_level {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
        cat c = new cat();
        c.eat();
        c.meow();
    }
