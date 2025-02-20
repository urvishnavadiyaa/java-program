package Oops.assingment1;

class Student2 {
    int rno;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int totalmark;
    double precentage;

    public Student2(int rno,String name,int mark1,int mark2,int mark3) {
        this.rno=rno;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.totalmark = mark1+mark2+mark3;
        this.precentage = (totalmark / 3);
    }

    public static String[] getTop3Student(Student2 s1,Student2 s2,Student2 s3,Student2 s4,Student2 s5) {
        Student2 arr[] = new Student2[5];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;
        String arr2[] = new String[3];
        Student2 top1 = null;
        Student2 top2 = null;
        Student2 top3 = null;

        for(int i=0;i<arr.length;i++) {
            if(top1 == null || arr[i].precentage > top1.precentage) {
                top3 = top2;
                top2 = top1;
                top1 = arr[i];
            }
            else if(top2 == null || arr[i].precentage > top2.precentage && arr[i].precentage != top1.precentage) {
                top3 = top2;
                top2 = arr[i];
            }
            else if(top3 == null || arr[i].precentage > top3.precentage && arr[i].precentage != top1.precentage && arr[i].precentage != top2.precentage) {
                top3 = arr[i];
            }
        }
        arr2[0] = top1.name;
        arr2[1] = top2.name;
        arr2[2] = top3.name;
        return arr2;
    }
    public String getname() {
        this.name=name;
        return name;
    }
}
public class Oops412 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "urvish", 89, 90, 88);
        Student2 s2 = new Student2(2, "parth", 78, 82, 80);
        Student2 s3 = new Student2(3, "yash", 92, 95, 93);
        Student2 s4 = new Student2(4, "akshay", 88, 95, 90);
        Student2 s5 = new Student2(5, "kalu", 91, 89, 94);

        String arr[] = Student2.getTop3Student(s1, s2, s3, s4, s5);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}


