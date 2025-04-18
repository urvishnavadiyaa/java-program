package Queue.Implemantation;

public class DoubleEnded_Queue {
    static int arr[]=new int[5];
    static int front=0;
    static int rear=-1;

    public static void InsertFirst(int val) {
        if (rear == arr.length-1) {
            System.out.println("queue is full");
        } else if (rear != -1) {
            int i= rear+1;
            while (i != front) {
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = val;
            rear++;
        } else {
            rear++;
            arr[rear] = val;
        }
    }

    public static void InsertLast(int val) {
        if (rear == arr.length-1) {
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] = val;
    }

    public static void DeleteFirst() {
        if (rear == -1) {
            System.out.println("queue is already empty");
            return;
        }
        int i=front;
        while (i != rear) {
            arr[i]=arr[i+1];
            i++;
        }
        rear--;
    }

    public static void DeleteLast() {
        if (rear == -1) {
            System.out.println("queue is already empty");
            return;
        }
        rear--;
    }

    public static void Print() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        InsertLast(10);
        InsertLast(20);
        InsertLast(30);
        InsertLast(40);
        InsertLast(50);
        InsertFirst(44);
        InsertFirst(45);
        InsertFirst(46);
        InsertFirst(47);
        InsertFirst(48);
        DeleteFirst();
        System.out.println(front);
        System.out.println(rear);
        DeleteLast();
        InsertFirst(42);
        InsertFirst(30);
        DeleteFirst();
        DeleteFirst();
        InsertLast(40);
        InsertFirst(32);
        DeleteFirst();
        DeleteFirst();
        InsertFirst(60);
        InsertFirst(54);
        DeleteLast();
        InsertLast(70);
        DeleteLast();
        Print();
    }
}
