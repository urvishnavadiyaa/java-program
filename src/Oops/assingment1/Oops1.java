package Oops.assingment1;

public class Oops1 {
    static class Student
    {
        int rNo;
        String name;
        int mark1;
        int mark2;
        int mark3;
        int totalmarks;

        public void setStudentDetails(int rNo,String name,int mark1,int mark2,int mark3) {
            this.rNo=rNo;
            this.name=name;
            this.mark1=mark1;
            this.mark2=mark2;
            this.mark3=mark3;
        }

        public void calculateTotal(int mark1,int mark2,int mark3) {
            this.totalmarks = mark1+mark2+mark3;
            System.out.println(totalmarks);
        }

        public void displayStudentDetails() {
            System.out.print(rNo+ " ");
            System.out.print(name+" ");
            System.out.print(mark1+" ");
            System.out.print(mark2+" ");
            System.out.print(mark3+" ");
            System.out.print(totalmarks+" ");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentDetails(1,"urvish",78,56,78);

        s1.calculateTotal(78,56,78);

        s1.displayStudentDetails();
    }
}
