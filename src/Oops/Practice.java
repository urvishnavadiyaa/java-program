package Oops;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

class Demo {
    private int rno;
    private String name;

    Demo(int rno,String name) {
        this.rno=rno;
        this.name=name;
    }
    public void setter(int rno) {
        this.rno=rno;
        System.out.println(rno);
    }
    public String getter(String name) {
        this.name=name;
        return name;
    }
//    Demo(Student s) {
//        s.rno=rno;
//        s.mark1= s.mark1;
//        System.out.println(rno);
//    }
}
class Student {
    int rno;
    int mark1;

    Student (int rno,int mark1) {
        this.rno=rno;
        this.mark1=mark1;
    }
//    Student s = new Student(3,78);
//    Demo d1 = new Demo(s);
}

class Box {
    Double h;
    Double w;
    Double l;

    public Box() {
        h = -1.0;
        w = -1.0;
        l = -1.0;
    }

//    public Box(Double amount) {
//        this.h = amount;
//        this.w = amount;
//        this.l = amount;
//    }


    public Box(Double l) {
        this.l = l;
    }

    public Box(Double h, Double w) {
        this.h = h;
        this.w = w;
    }

    public Box(Double h, Double w, Double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }
}
class amazon extends Box {
    Double waight;

    public amazon() {
        this.waight = -1d;
    }

    public amazon(Double waight) {
        this.waight = waight;
    }

    public amazon(Double h, Double w, Double l, Double waight) {
        super(h, w, l);
        this.waight = waight;
    }
}
public class Practice {
    public static void main(String[] args) {
//        Demo d1 = new Demo(1,"java");
//        d1.setter(2);
//        String name=d1.getter("urvish");
//        System.out.println(name);
//        System.out.println(d1.getter("urvish"));
//        System.out.println(d1.setter(2));
//        Student s = new Student(3,78);
//        Demo d = new Demo(s);

        amazon a = new amazon(4.0d, 30d, 35d, 353d);
        System.out.println(a.h +" "+a.w +" "+ a.l +" "+ a.waight);
//        Stack<Integer> stk = new Stack<>();
        int arr[] = {24, 42, 24};
        Arrays.toString(arr);
    }
}
