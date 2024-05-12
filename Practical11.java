
// Public class
public class Practical11 {
    // Private variable
    private int privateVariable = 10;
    // Protected variable
    protected int protectedVariable = 20;
    // Default (package-private) variable
    int defaultVariable = 30;
    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }
    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default method");
    }
    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }
    // Main method
    public static void main(String[] args) {
        // Create an object of the Practical11 class
        Practical11 obj1 = new Practical11();

        // Access the public variable
        System.out.println(obj1.defaultVariable);

        // Access the protected variable - Note: This line won't compile as it's not accessible in a static context
        // System.out.println(obj1.protectedVariable);
        // Access the default variable - Note: This line won't compile as it's not accessible in a static context
        // System.out.println(obj1.defaultVariable);
        // Call the public method

        obj1.publicMethod();

        // Call the protected method - Note: This line won't compile as it's not accessible in a static context
        // obj1.protectedMethod();
        // Call the default method - Note: This line won't compile as it's not accessible in a static context
        // Practical11.defaultMethod();
        // Try to access the private variable - Note: This line won't compile as it's not accessible in a static context
        // System.out.println(obj1.privateVariable);
        // Try to call the private method - Note: This line won't compile as it's not accessible in a static context
        // obj1.privateMethod();
    }
}
