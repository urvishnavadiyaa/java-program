package Oops.assingment1;

public class Oops41 {
    public static void main(String[] args) {
        Student1 student[] = new Student1[5];
        student[0] = new Student1(1, "urvish", 85, 90, 88);
        student[1] = new Student1(2, "parth", 78, 82, 80);
        student[2] = new Student1(3, "yash", 92, 95, 93);
        student[3] = new Student1(4, "akshay", 88, 95, 90);
        student[4] = new Student1(5, "kalu", 91, 89, 94);
        Student1.getTop3Student(student);

        System.out.println(student[0].getname());
        System.out.println(student[1].getname());
        System.out.println(student[2].getname());
    }
}
class Student1 {
    private int rno;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalmark;

    Student1(int rno,String name,int mark1,int mark2,int mark3) {
        this.rno=rno;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.totalmark=mark1+mark2+mark3;
    }

    public static void getTop3Student(Student1 student[]) {
        for(int i=0;i<student.length-1;i++) {
            for(int j=0;j<student.length-1-i;j++) {
                if(student[j].totalmark < student[j+1].totalmark) {
                    Student1 temp=student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }
    public String getname() {
        this.name=name;
        return name;
    }
}
