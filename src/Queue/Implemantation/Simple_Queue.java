package Queue.Implemantation;

public class Simple_Queue {
    static int arr[] = new int[5];
    static int front=-1;
    static int rear=-1;
    public static int enQueue(int val) {
        if (rear == arr.length-1) {
            System.out.println("Queue is full");
            return rear;
        }
        rear++;
        arr[rear] = val;
        return rear;
    }

    public static int deQueue() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        front++;
        if (front == rear) {
            front = rear = -1;
        }
        return front;
    }

    public static void PrintQueue() {
        for (int i = front+1; i <=rear; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        enQueue(40);
        deQueue();
        deQueue();
        System.out.println(front);
        System.out.println(rear);
        PrintQueue();
    }
}
