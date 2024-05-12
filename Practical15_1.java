class Practical15_1 extends Thread {
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println(i);
        }
    }
}
class PEKKAthread extends Thread {
    public void run() {
        for(int i=10; i>=5; i--) {
            System.out.println(i);
        }
    }
}
class ThreadProg {
    public static void main(String args[]) {
        Practical15_1  t1 = new Practical15_1();
        PEKKAthread  t2 = new PEKKAthread();
        t1.start();
        t2.start();
    }
}
