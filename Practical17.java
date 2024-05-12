import java.util.ArrayList;
import java.util.Stack;

public class Practical17 {
    public static void main(String[] args) {
        // List Operations
        ArrayList<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        // Displaying the list
        System.out.println("List elements:");
        System.out.println(myList);

        // Stack Operations
        Stack<String> myStack = new Stack<>();

        // Pushing elements to the stack
        myStack.push("X");
        myStack.push("Y");
        myStack.push("Z");

        // Displaying the stack
        System.out.println("\nStack elements:");
        System.out.println(myStack);

        // Popping elements from the stack
        String poppedElement = myStack.pop();
        System.out.println("\nPopped Element: " + poppedElement);

        // Displaying the updated stack
        System.out.println("Stack after pop operation:");
        System.out.println(myStack);
    }
}
