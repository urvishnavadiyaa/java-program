package Oops.assingment1;

import java.util.Arrays;
class Student {
    int rno;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int totalmark;
    double precentage;

    public Student(int rno,String name,int mark1,int mark2,int mark3) {
        this.rno=rno;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.totalmark = mark1+mark2+mark3;
        this.precentage = (totalmark / 3);
    }

    public static String[] getTop3Student(Student s1,Student s2,Student s3,Student s4,Student s5) {
        Student arr[] = new Student[5];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;
        String arr2[] = new String[3];
//        Student top1 = s1;
//        Student top2 = s2;
//        Student top3 = s3;
        for (int i = 0; i < arr2.length; i++) {
            Student top = arr[i];
            int idx=0;
            if (arr[i].precentage == -1) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].precentage > top.precentage) {
                    idx = j;
                    top = arr[j];
                }
            }
            Double temp = arr[i].precentage;
            arr[i] = arr[idx];
            arr[idx].precentage = temp;
            arr2[i] = arr[i].name;
        }
        return arr2;
    }
//    public  String getname() {
//        this.name=name;
//        return name;
//    }
}
public class Oops4 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "urvish", 89, 90, 88);
        Student s2 = new Student(2, "parth", 78, 82, 80);
        Student s3 = new Student(3, "yash", 92, 95, 93);
        Student s4 = new Student(4, "akshay", 88, 95, 90);
        Student s5 = new Student(5, "kalu", 91, 89, 94);

        String arr[] = Student.getTop3Student(s1, s2, s3, s4, s5);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

