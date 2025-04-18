package Queue.LeetCode;
import java.util.*;

public class Leetcode2073 {
    public static void main(String[] args) {
        int tickets[] = {1,2,3,4,5};
        int k = 3;
        Queue<Integer> q = new LinkedList<>();
        for ( int i = 0; i < tickets.length; i++){
            q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            ++count;
            int front = q.poll();
            if(tickets[front] >= 1){
                tickets[front] -= 1;
            }
            if(k == front && tickets[front] == 0){
                break;
            }
            if(k != front && tickets[front] == 0){
                continue;
            }
            q.add(front);
        }
        System.out.println(count);
    }
}
