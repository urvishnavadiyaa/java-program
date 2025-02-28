package Oops;

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
////        System.out.println(rno);
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
public class Practice {
    public static void main(String[] args) {
        Demo d1 = new Demo(1,"java");
//        d1.setter(2);
//        String name=d1.getter("urvish");
//        System.out.println(name);
//        System.out.println(d1.getter("urvish"));
//        System.out.println(d1.setter(2));
//        Student s = new Student(3,78);
//        Demo d = new Demo(s);

    }
}
