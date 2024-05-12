class Practical15_2 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
class B implements Runnable {
    public void run() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
class ThreadProgRunn {
    public static void main(String args[]) {
        Practical15_2 obj1 = new Practical15_2();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
