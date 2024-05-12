import java.io.IOException;
public class Practical13 {
    // Method that throws an IOException
    static void exampleMethod() throws IOException {
        throw new IOException("IOException occurred");
    }
    public static void main(String[] args) {
        try {
            exampleMethod(); // Call the method that throws an IOException
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
