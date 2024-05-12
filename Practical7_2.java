class PEKKAmli{
    public void run(){
        System.out.println("PEKKAmli is Running");
    }
}
class mliPEKKA extends PEKKAmli{
    public void walk(){
        run();
        System.out.println("mliPEKKA is Walking");
    }
}
class PowerPEKKA extends mliPEKKA{
    public void sleep(){
        run();
        walk();
        System.out.println("PowerPEKKA is Sleeping");
    }
}
public class Practical7_2
{
    public static void main(String[] args)
    {   
        PowerPEKKA obj1 = new PowerPEKKA();
        obj1.sleep();
    }
}
