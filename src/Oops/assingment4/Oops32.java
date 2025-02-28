package Oops.assingment4;

class SalarySlip {
    int empid;
    String name;
    int salary;
    int month;

    public SalarySlip(int empid, String name, int salary, int month) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public static void calculate(SalarySlip[][] month){
        for (int i = 0; i < month.length; i++) {
            int m = month[i][0].getmonth();
            int id1 =0;
            int id2 =0;
            int max1=0;
            int max2=0;
            for (int j = 0; j < month[0].length; j++) {
                if (month[i][j].getSalary() > max1) {
                    max2 = max1;
                    id2 = id1;
                    max1 = month[i][j].getSalary();
                    id1 = month[i][j].getid();
                } else if (month[i][j].getSalary() > max2 && max2 != max1) {
                    max2 = month[i][j].getSalary();
                    id2 = month[i][j].getid();
                }
            }
            System.out.println(m + "->" + id1 + "," + id2);
        }
    }

    private int getid() {
        return empid;
    }

    private int getmonth() {
        return month;
    }

    private int getSalary() {
        return salary;
    }
}
public class Oops32 {
    public static void main(String[] args) {
        SalarySlip[][] month = {{
                new SalarySlip(1001, "yash", 15000, 1),
                new SalarySlip(1002, "keshav", 12000, 1),
                new SalarySlip(1003, "rahul",11000, 1),
                new SalarySlip(1004, "mayank", 16000, 1) },
                {
                new SalarySlip(1001, "yash", 16000, 2),
                new SalarySlip(1002, "keshav", 17000, 2),
                new SalarySlip(1003, "rahul",18000, 2),
                new SalarySlip(1004, "mayank", 14000, 2) },
                {
                new SalarySlip(1001, "yash", 14000, 3),
                new SalarySlip(1002, "keshav", 12000, 3),
                new SalarySlip(1003, "rahul",16000, 3),
                new SalarySlip(1004, "mayank", 12000, 3) },
                {
                new SalarySlip(1001, "yash", 12000, 4),
                new SalarySlip(1002, "keshav", 16000, 4),
                new SalarySlip(1003, "rahul",11000, 4),
                new SalarySlip(1004, "mayank", 19000, 4) }};
        SalarySlip.calculate(month);
    }
}
