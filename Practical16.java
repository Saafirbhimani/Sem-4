import java.io.File;
public class Practical16 {
    public static void main(String[] args) {
        // Replace "your_file_path" with the path to the file you want to inspect
        File file = new File("your_file_path");

        // Check if the file exists
        if (file.exists()) {

            // Print file properties
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");

            // Check if the file is readable, writable, and executable
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());

            // Check if the file is a directory or a regular file
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());

            // Print last modified timestamp
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
