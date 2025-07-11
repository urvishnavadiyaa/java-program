package CoreJava.MultiThreding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(444);
        arrayList.add(5);
        arrayList.add(1234);
        arrayList.add(6235);
        Collections.sort(arrayList, new NumberComparator());
        System.out.println(arrayList);
    }
}

class NumberComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        return s2.compareTo(s1);
    }
}
