package Oops;

interface Vehical {
    void gearChange();
}
class bicycle implements Vehical {
    public void gearChange() {
        System.out.println("max gear is 2...");
    }
}

class Bike implements Vehical {
    public void gearChange() {
        System.out.println("max gear is 3...");
    }
}

class car implements Vehical {
    public void gearChange() {
        System.out.println("max gear is 5...");
    }
}

public class assingment3 {
    public static void main(String[] args) {
        bicycle b1 =new bicycle();
        b1.gearChange();
        Bike c1 = new Bike();
        c1.gearChange();
        car d1 = new car();
        d1.gearChange();

    }
}
