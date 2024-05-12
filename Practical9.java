abstract class Animal
{
    abstract void run();
    abstract void roar();
}
class Lion extends Animal
{
    void run(){
        System.out.println("Lion is Runnning.");
    }
    void roar()
    {
        System.out.println("Lion is Roaring.");
    }
    public static void main(String[] args){
        Lion l1 = new Lion();
        l1.run();
        l1.roar();
    }
}
