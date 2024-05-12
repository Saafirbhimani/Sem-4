// Parent class
class PEKKAhy {
    void eat() {
        System.out.println("PEKKAhy is eating");
    }
}
// Child class 1
class hyPEKKA extends PEKKAhy {
    void bark() {
        System.out.println("hyPEKKA is barking");
    }
}
// Child class 2
class hybPEKKA extends PEKKAhy {
    void meow() {
        System.out.println("hybPEKKA is meowing");
    }
}
// Child class 3
class BabyPEKKA extends hyPEKKA {
    void weep() {
        System.out.println("BabyPEKKA is weeping");
    }
}
// Interface
interface Pet {
    void play();
}
// Child class 4
class Boy implements Pet {
    public void play() {
        System.out.println("Boy is playing");
    }
}
public class Practical7_5 {
    public static void main(String[] args) {
        // Creating objects of different classes
        hyPEKKA obj1 = new hyPEKKA();
        hybPEKKA obj2 = new hybPEKKA();
        BabyPEKKA obj3 = new BabyPEKKA();
        Boy obj4 = new Boy();
        // Accessing methods of parent and child classes
        obj1.eat();
        obj1.bark();
        obj2.eat();
        obj2.meow();
        obj3.eat();
        obj3.bark();
        obj3.weep();
        // Accessing methods of interface
        obj4.play();
    }
}
