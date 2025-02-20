package Oops;

class person {
    private String name;
    private int age;
    private String address;

    public void print() {
        System.out.println("class person");
        System.out.println(name);
    }

    public person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class student  extends person
{
    int rno;
    int mark;

    public student(String name, int age, String address,int rno,int mark) {
        super(name, age, address);
        this.rno=rno;
        this.mark=mark;
    }
}

public class InharitEx {
    public static void main(String[] args) {
         student s1 = new student("urvish",20,"dswcgtrhg",1,98);
         s1.print();
    }
}
