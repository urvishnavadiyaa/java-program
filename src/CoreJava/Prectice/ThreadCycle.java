package CoreJava.Prectice;

public class ThreadCycle {
    public static void main(String[] args) throws InterruptedException {
        thread1 trd = new thread1();
        trd.start();
//        trd.setContextClassLoader(Thread.MAX_PRIORITY);
    }
}

class thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
