package Hashing.Program;

import java.util.HashMap;

public class Most_frequent_Ele {
    public static void main(String[] args) {
        int[] arr = {1,4,7,1,4,7,8,9,2,4,5,6,1,1,4,2,3,5,3,1,6,6,8,2,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int ele : arr) {
            if (hm.containsKey(ele)) {
                hm.put(ele,hm.get(ele) + 1);
            }else{
                hm.put(ele,hm.getOrDefault(ele,1));
            }
        }
        int frequent = 0;
        int max = 0;
        for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                frequent = entry.getKey();
            }
        }
        System.out.println(frequent);
    }
}
