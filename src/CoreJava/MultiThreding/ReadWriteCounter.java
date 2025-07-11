package CoreJava.MultiThreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readlock = lock.readLock();
    private final Lock writelock = lock.writeLock();

    public void increment() {
        writelock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writelock.unlock();
        }
    }

    public int getcount() {
        readlock.lock();
        try {
            return count;
        } finally {
            readlock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();
        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getcount());
                }
            }
        };

        Runnable wirteTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented : ");
                }
            }
        };

        Thread writeThread = new Thread(wirteTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count : " + counter.getcount());
    }
}
