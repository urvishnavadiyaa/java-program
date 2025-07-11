package CoreJava.Prectice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synchronization {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bank.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
class BankAccount {
    private int balance = 100;

    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proccesing to withdraw ");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " complete withdraw . Remaining balance  " + balance);
                    } catch (Exception e) {
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insifficient balance ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not aquair will try leter");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
