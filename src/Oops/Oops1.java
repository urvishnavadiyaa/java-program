package Oops;

public class Oops1 {
    static class Student {
        private int rono;
        private String name;
        private int age;
        private int marks;

        Student() {
        }

        Student(int r, String n, int a) {
            rono = r;
            name = n;
            age = a;
        }

        public void setMarks(int m) {
            marks = m;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "ABC", 20);
        s1.setMarks(90);
        Student s2 = new Student();
        System.out.println(s1.rono);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
    }
}
