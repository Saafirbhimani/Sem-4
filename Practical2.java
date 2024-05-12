import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        PEKKAJava obj1 = new PEKKAJava();
    }
}

class PEKKAJava {
    PEKKAJava() {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array to store the entered integers
        int[] num = new int[10];

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        // Sort the array in decreasing order
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        // Display the integers in decreasing order
        System.out.println("Display Integer in decreasing order:");

        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }

        // Close the scanner
        sc.close();
    }
}
