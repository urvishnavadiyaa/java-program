package CoreJava.MultiThreding;

public class P1 {
    public static void main(String[] args) {
        int N = 10;
        oddevenprinter printer = new oddevenprinter(N);

        Thread T1 = new Thread(() -> printer.printodd(), "Thread-1");
        Thread T2 = new Thread(() -> printer.printeven(), "Thread-2");

        T1.start();
        T2.start();
    }
}

class oddevenprinter {
    private int curernt = 1;
    private final int N;

    public oddevenprinter(int n) {
        this.N = n;
    }

    public void printodd() {
        while (curernt <= N) {
            synchronized (this) {
                if (curernt % 2 == 1) {
                    System.out.println(curernt + " - " + Thread.currentThread().getName());
                    curernt++;
                    notify();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void printeven() {
        while (curernt <= N) {
            synchronized (this) {
                if (curernt % 2 == 0) {
                    System.out.println(curernt + " - " + Thread.currentThread().getName());
                    curernt++;
                    notify();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

