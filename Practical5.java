import java.util.*; 
class PEkkajar{
     // Constructor overloading
    PEkkajar(){
        System.out.println("Default Constructor Called:");
    }
    PEkkajar(int a){
        System.out.println("First Parameterized Constructor Called with one Parameter:");
        System.out.println("Value of a is :" +a);
    }
    PEkkajar(double a , double b){
        System.out.println("Second Parameterized Constructor Called with two Parameter:");
        System.out.println("Value of a is :" +a+ "\n Value of b is : " +b);
    }
    // Method overloading
    public void add(){
        System.out.println("Add Method with No Parameter: ");
    }
    public void add(int a){
        System.out.println("Add Method with one Parameter: " +a);
    }
    public void add(double a, double b){
        System.out.println("Add Method with two Parameter: " +a+ "and" +b);
    }
    public static void main(String[] args) {
        // Constructor overloading demonstration
        PEkkajar obj1 = new PEkkajar();
        PEkkajar obj2 = new PEkkajar(50);
        PEkkajar obj3 = new PEkkajar(70.0,20.0);
        // Method overloading demonstration
        obj1.add();
        obj2.add(24);
        obj3.add(24.0,36.0);
    }
}

