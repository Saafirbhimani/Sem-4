class PEKKAdbds {
    // Static method

    static void staticBinding() {
        System.out.println("Static binding: Inside staticBinding() method.");
    }

    // Dynamic method

    void dynamicBinding() {
        System.out.println("Dynamic binding: Inside dynamicBinding() method.");
    }
}

public class Practical10 {

    public static void main(String[] args) {

        // Static binding - resolved at compile time
        PEKKAdbds.staticBinding();

        // Dynamic binding - resolved at runtime

        PEKKAdbds obj = new PEKKAdbds();
        obj.dynamicBinding();

        // Dynamic binding with superclass reference and subclass object

        PEKKAdbds obj2 = new PaltuPEKKA();
        obj2.dynamicBinding();

    }
}
class PaltuPEKKA extends PEKKAdbds {
  
  void dynamicBinding() {
        System.out.println("Dynamic binding: Inside dynamicBinding() method.");
    }
}
