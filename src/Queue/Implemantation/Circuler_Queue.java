package Queue.Implemantation;

import java.util.Arrays;

public class Circuler_Queue {
    static int arr[] = new int[5];
    static int front=-1;
    static int rear=-1;

    public static void enQueue(int val) {
        if (rear == arr.length-1) {
            if (front == -1) {
                System.out.println("Queue is full");
                return;
            } else {
                rear = 0;
                arr[rear] = val;
                return;
            }
        } else if (front == rear && front != -1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = val;
    }

    public static void deQueue() {
        if (rear == -1) {
            System.out.println("queue is empty");
        } else if (front == arr.length-1) {
            arr[front] = 0;
            front = -1;
        } else {
            front++;
            arr[front] = 0;
        }
    }

    public static void Print() {
        front++;
        while (true) {
            System.out.print(arr[front]+" ");
            if (front == arr.length-1) {
                front = -1;
            }
            front++;
            if (front == rear) {
                System.out.print(arr[front]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        deQueue();
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        enQueue(40);
        enQueue(40);
        deQueue();
        deQueue();
        enQueue(50);
        enQueue(60);
        enQueue(70);
        System.out.println(front);
        System.out.println(rear);
        System.out.println(Arrays.toString(arr));
        Print();
    }
}
