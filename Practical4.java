import java.util.*;
public class Practical4 {
    public static void main(String[] args) {
        PEKKAJ obj1 = new PEKKAJ();//Default Constructor Called
        PEKKAJ obj2 = new PEKKAJ(30,40);//Parameterized Constructor Called

        obj1 = null; // by object destructor 
        obj2 = null; // by object destructor
        
        //garbage collection to call the finalize method (destructor)
        System.gc();
    }
}

class PEKKAJ{
    //Create Default Constructor
    public PEKKAJ(){
        System.out.println("Default Constructor called:");
    }
    //Create Parameterized Constructor
    public PEKKAJ(int a, int b){
        System.out.println("Parameterized Constructor called:");
        System.out.println("Value of A is = " +a+ "Value of B is = "+b);
    }
    // Destructor using finalize() Method
    protected void finalize(){
        System.out.println("Destructor Called:");
    }
}
