package Arrays;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int a1[]={1,4,6,8,10,13,17};
        int a2[]={11,12,15,18,22,34,45,55,59};
        int n1=a1.length;
        int n2=a2.length;
        int n3=n1+n2;
        int a3[]=new int[n3];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2) {
            if(a1[i] < a2[j]) {
                a3[k] = a1[i];
                i++;
            }else {
                a3[k] = a2[j];
                j++;
            }
            k++;
        }
        while(i != n1) {
            a3[k] = a1[i];
            i++;
            k++;
        }
        while(j != n2) {
            a3[k] =a2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
