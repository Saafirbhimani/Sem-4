// Parent class
class PEKKAhi {
    void eat() {
        System.out.println("PEKKAhi is eating");
    }}
// Child class 1
class hiPEKKA extends PEKKAhi {
    void bark() {
        System.out.println("hiPEKKA is destroying");
    }}
// Child class 2
class PekkaPEKKA extends PEKKAhi {
    void meow() {
        System.out.println("PekkaPEKKA likes butterflies");
    }}
public class Practical7_4 {
    public static void main(String[] args) {
        // Creating objects of child classes
        hiPEKKA obj1 = new hiPEKKA();
        PekkaPEKKA obj2 = new PekkaPEKKA();
        // Accessing methods of parent class
        obj1.eat();  
        obj2.eat();  
        obj1.bark(); 
        obj2.meow(); 
    }}
