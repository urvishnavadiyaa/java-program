package CoreJava.MultiThreding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        List<Stude> studes = new LinkedList<>();
        studes.add(new Stude(10, "abc"));
        studes.add(new Stude(20, "xyz"));
        studes.add(new Stude(15, "pqr"));

        Collections.sort(studes);
        System.out.println(studes.get(2).mark);
    }
}

class Stude implements Comparable<Stude> {
    int mark;
    String name;

    public Stude(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public int compareTo(Stude o) {
        if (this.mark > o.mark) {
            return 1;
        } else if (this.mark < o.mark) {
            return -1;
        }
        return 0;
    }
}
