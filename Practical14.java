// Custom exception class
class CustomException extends Exception {
    // Constructor with a message
    public CustomException(String message) {
        super(message);
    }
}

public class Practical14 {
    // Method that throws the custom exception
    static void exampleMethod(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative value not allowed");
        } else {
            System.out.println("Value is: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            // Call the method with a negative value
            exampleMethod(-5);
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
