package Arrays;

public class CopyArr {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        int arr2[] = new int[n];
        arr2 = arr;
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
