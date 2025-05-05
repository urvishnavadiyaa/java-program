package Recursion;

class person{
    public void gm(){
        System.out.println("gm person");
    }
}
class student extends person {
    public void gm(){
        System.out.println("gm student");
    }
}
class teacher extends student{
    @Override
    public void gm(){
        System.out.println("gm teacher");
    }
    teacher(){
        super.gm();
    }
}

public class demo {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.gm();
    }
}
