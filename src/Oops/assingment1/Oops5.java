package Oops.assingment1;

class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String name,int day,String month) {
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean isSamemonth(Holiday h1,Holiday h2) {
        if(h1.month == h2.month) {
            return true;
        }
        return false;
    }
    public static Double avgDate(Holiday h[]) {
        Double average = (double) 0;
        for(int i=0;i< h.length;i++) {
            average = average + h[i].day;
        }
        average = average / h.length;
        return average;
    }
}
public class Oops5 {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("urvish",9,"august");
        Holiday h2 = new Holiday("roy",13,"sept");
        Holiday h3 = new Holiday("akshay",23,"march");
        Holiday h4 = new Holiday("parth",29,"sept");
        Holiday h5 = new Holiday("yash",2,"august");
        Holiday h6 = new Holiday("kalu",11,"march");

        System.out.println(Holiday.isSamemonth(h1,h5));
        System.out.println(Holiday.isSamemonth(h2,h6));
        Holiday h[] = {h1,h2,h3,h4,h5,h6};
        Double ans= Holiday.avgDate(h);
        System.out.println(ans);
    }
}
