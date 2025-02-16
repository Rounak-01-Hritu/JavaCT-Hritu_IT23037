class SharedResource {
    synchronized void printNumbers(int n) { // synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(() -> obj.printNumbers(2));
        Thread t2 = new Thread(() -> obj.printNumbers(3));

        t1.start();
        t2.start();
    }
}
