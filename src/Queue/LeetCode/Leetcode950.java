package Queue.LeetCode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode950 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(deckRevealedIncreasing(arr)));
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Deque<Integer> indices = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        for (int card : deck) {
            int idx = indices.poll();
            result[idx] = card;
            if (!indices.isEmpty()) {
                indices.add(indices.poll());
            }
        }
        return result;
    }
}

//         Arrays.sort(arr);
//         Queue<Integer> q = new LinkedList<>();
//         int arr2[] = new int[arr.length];
//         if (arr.length % 2 == 0) {
//             int i=0;
//             int idx=0;
//             int mid=(arr.length/2);
//             for (int j = 0; j < arr.length; j+=2) {
//                 arr2[j] = arr[idx];
//                 arr2[j+1] = arr[mid];
//                 idx++;
//                 mid++;
//             }
//         }else {
//             int i2=(arr.length/2)+1;
//             while (i2 < arr.length) {
//                 q.add(arr[i2]);
//                 i2++;
//             }
// //            if (q.size() % 2 == 0 && arrsize % 2 != 1) {
// //                int idx = 0;
// //                for (int i = 0; i < arr2.length; i += 2) {
// //                    arr2[i] = arr[idx];
// //                    if (!q.isEmpty()) {
// //                        int val = q.poll();
// //                        arr2[i + 1] = val;
// //                    }
// //                    if (!q.isEmpty()) {
// //                        q.add(q.poll());
// //                    }
// //                    idx++;
// //                }
// //            } else {
//                 q.add(q.poll());
//                 int idx = 0;
//                 for (int i = 0; i < arr2.length; i += 2) {
//                     arr2[i] = arr[idx];
//                     if (!q.isEmpty()) {
//                         int val = q.poll();
//                         arr2[i + 1] = val;
//                     }
//                     if (!q.isEmpty()) {
//                         q.add(q.poll());
//                     }
//                     idx++;
//                 }
// //            }
//         }
// //         return arr2;
