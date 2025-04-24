package Hashing.Program;

import java.util.HashMap;

public class Check_Arr_Equal {
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,2,6,4,4,4,2,3};
        int[] arr2 = {3,6,2,1,4,3,2,4,3,4,5};

        HashMap<Integer,Integer> hm1 = new HashMap<>();
        if (arr.length != arr2.length) {
            System.out.println("Not Equals");
            return;
        }
        for (int i = 0 ; i < arr.length; i++) {
            if (hm1.containsKey(arr[i])) {
                hm1.put(arr[i],hm1.get(arr[i]) + 1);
            }else{
                hm1.put(arr[i],hm1.getOrDefault(arr[i],1));
            }
        }
        for (int ele : arr2) {
            if (hm1.containsKey(ele) && hm1.get(ele) > 0) {
                hm1.put(ele,hm1.get(ele) - 1);
            } else {
                System.out.println("not equal");
                return;
            }
        }
        System.out.println("equal");
    }
}
