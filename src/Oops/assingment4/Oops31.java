package Oops.assingment4;

class Employee {
    int eid;
    String name;
    Enum JobTitle;
    int salary;

    public Employee(int eid, String name, Enum JobTitle, int salary) {
        this.eid = eid;
        this.name = name;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }
    public JobTitle getJobTitle() {
        return (JobTitle) JobTitle;
    }
    public int getSalary() {
        return salary;
    }

    public static void calSalary(Employee arr[]) {
        int Peon=0;
        int Prof=0;
        int HOD=0;
        int Principle=0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i].getJobTitle()) {
                case Peon: {
                    Peon = Peon + arr[i].getSalary();
                    break;
                }
                case Prof: {
                    Prof = Prof + arr[i].getSalary();
                    break;
                }
                case HOD: {
                    HOD = HOD + arr[i].getSalary();
                    break;
                }
                case Principle: {
                    Principle = Principle + arr[i].getSalary();
                    break;
                }
            }
        }
        System.out.println("Peon " + Peon);
        System.out.println("Prof " + Prof);
        System.out.println("HOD " + HOD);
        System.out.println("Principle " + Principle);
    }
}

public class Oops31 {
    public static void main(String[] args) {
        Employee e[] ={
                new Employee(1, "raju", JobTitle.Peon, 200000),
                new Employee(2, "kaju", JobTitle.HOD, 300000),
                new Employee(3, "ram", JobTitle.Principle, 520000),
                new Employee(4, "dinesh", JobTitle.Peon, 450000),
                new Employee(5, "mahesh", JobTitle.HOD, 760000),
                new Employee(6, "roy", JobTitle.Prof, 120000),
                new Employee(7, "akshay", JobTitle.Peon, 780000),
                new Employee(8, "parth", JobTitle.Prof, 340000),
                new Employee(9, "yash", JobTitle.Prof, 230000),
                new Employee(10, "nevil", JobTitle.Principle, 490000)
        };
        Employee.calSalary(e);
    }
}
