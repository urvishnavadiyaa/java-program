package Oops.assingment2;

import java.util.Scanner;

class Student {
    private static int uniqnum=0;
    static int countstudent=0;
    private int rno;
    private String name;
    private int arr[];
//    private int mark1;
//    private int mark2;
//    private int mark3;
//    private int mark4;
//    private int mark5;
    private int totalmark;

    Student() {
        countstudent++;
        uniqnum++;
        this.rno=uniqnum;
        this.name=" ";
        this.arr=new int[5];
        this.totalmark=0;
    }

//    public Student(int rno,String name,int mark1,int mark2,int mark3,int mark4,int mark5) {
//        this.rno=rno;
//        this.name=name;
//        this.mark1=mark1;
//        this.mark2=mark2;
//        this.mark3  =mark3;
//        this.mark4=mark4;;
//        this.mark5=mark5;
//        this.totalmark=mark1 + mark2 + mark3 + mark4 + mark5;
//    }

    public String getname() {
        this.name=name;
        return name;
    }
    public void input() {
        System.out.print("enter your name : ");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.print("enter mark of 5 subject : ");
        int totalmark=0;
        for(int i=0;i<5;i++) {
            System.out.print("subject " + (i+1) + ": ");
            this.arr[i] = sc.nextInt();
            this.totalmark=totalmark+this.arr[i];
        }
    }

    public void show(Student s1) {
        System.out.print(s1.rno+" ");
        System.out.print(s1.name+" ");
        for(int i=0;i<5;i++) {
            System.out.print(s1.arr[i] + " , ");
        }
    }

    public static int totalstudent() {
        return countstudent;
    }

    public static int totalmark(Student s) {
        int total = 0;
        for(int i=0;i<s.arr.length;i++) {
            total=total+s.arr[i];
        }
        return total;
    }

    public static int getHighest(Student s) {
        int high=0;
        for(int i=0;i<s.arr.length;i++) {
            if(s.arr[i] > high) {
                high=s.arr[i];
            }
        }
        return high;
    }

    public static int getLowest(Student s) {
        int low=Integer.MAX_VALUE;
        for(int i=0;i<s.arr.length;i++) {
            if(s.arr[i] < low) {
                low=s.arr[i];
            }
        }
        return low;
    }

    public static int getAverage(Student s) {
        int totmark=0;
        for(int i=0;i<s.arr.length;i++) {
            totmark=totmark+s.arr[i];
        }
        return totmark/s.arr.length;
    }

    public static int getpassCount(Student stud[]) {
        int count =0;
        for(int i=0;i<stud.length;i++) {
            Student s=stud[i];
            for(int j=0;j<s.arr.length;j++) {
                if(s.arr[j] < 50) {
                    break;
                }
                if(j == s.arr.length-1) {
                    count++;
                }
            }
        }
        return count;
    }
}
public class Oops21 {
    public static void main(String[] args) {
        Student s1 = new Student();
//        Student s1 = new Student(1,"urvish",76,98,87,87,76);
        s1.input();
        s1.show(s1);
        Student s2 = new Student();
//        Student s2 = new Student(2,"akshay",76,34,98,77,56);
        s2.input();
        s2.show(s2);
        Student s3 = new Student();
//        Student s3 = new Student(3,"roy",65,98,87,98,65);
        s3.input();
        s3.show(s3);
        System.out.println(s1.getname());
        int total = Student.totalstudent();
        System.out.println(total);
        int cal = Student.totalmark(s1);
        System.out.println(cal);
        int high = Student.getHighest(s1);
        System.out.println(high);
        int low = Student.getLowest(s1);
        System.out.println(low);
        int ave = Student.getAverage(s1);
        System.out.println(ave);
        Student stud[]={s1,s2,s3};
        int passcount = Student.getpassCount(stud);
        System.out.println(passcount);
    }
}
