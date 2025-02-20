package Arrays;

import java.util.Arrays;

public class ArrayBasicPro {
    public static void insert(int a1[],int val,int pos) {
        if(a1[a1.length-1] != 0 ) {
            System.out.println("array is full");
            return;
        }
        for(int i=0;i<a1.length;i++) {
            if(pos == 0) {
                a1[i] =val;
                return;
            }
            if(val < a1[i]) {
                int j=a1.length-2;
                while(j != i-1) {
                    a1[j+1] = a1[j];
                    j--;
                }
                a1[i] = val;
                return;
            }
            if(a1[i] == 0) {
                a1[i] =val;
                return;
            }
        }
    }
    public static void update(int a1[],int pos,int val) {
        for(int i=0;i<a1.length;i++) {
            if(i == pos) {
                a1[i] = val;
                int j=i;
                while(j != a1.length-1) {
                    if(a1[j] > a1[j+1]) {
                        int temp = a1[j];
                        a1[j] = a1[j+1];
                        a1[j+1] = temp;
                        j++;
                    }else {
                        return;
                    }
                }
            }
        }
    }
    public static int search(int a1[],int val) {
        for(int i=0;i<a1.length;i++) {
            if(a1[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public static void print(int a1[]) {
        for(int i=0;i<a1.length;i++) {
            System.out.print(a1[i]+" ");
        }
        System.out.println();
    }
    public static void delete(int a1[],int val) {
        for(int i=0;i<a1.length;i++) {
            if(a1[i] == val) {
                a1[i] = 0;
                int j=i;
                while(j != a1.length-1) {
                    a1[j] = a1[j+1];
                    j++;
                }
                a1[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        insert(arr,3,0);
        insert(arr,1,1);
        insert(arr,9,2);
        insert(arr,5,3);
        insert(arr,2,4);
        System.out.println(Arrays.toString(arr));
        update(arr,1,10);
        System.out.println(Arrays.toString(arr));
        int ans =search(arr,5);
        System.out.println(ans);
        print(arr);
        delete(arr,5);
        delete(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}
