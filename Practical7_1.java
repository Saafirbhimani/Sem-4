class siPEKKA{
    public void run(){
        System.out.println("siPEKKA is Running");
    }
}
class PEKKAsi extends siPEKKA{
    public void walk(){
        run();
        System.out.println("PEKKAsi is Walking");
    }
}
public class Practical7_1
{
    public static void main(String[] args)
    {   
        PEKKAsi obj1 = new PEKKAsi();
        obj1.walk();
    }
}
