package CoreJava.Prectice;

public class CreateSimpleThread {
    public static void main(String[] args) {
        thread trd = new thread();
        Thread t1 = new Thread(trd);
        t1.start();
        for (int i = 1; i < 10; i++) {
            System.out.println("hello");
        }
    }
}
