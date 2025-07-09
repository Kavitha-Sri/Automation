import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        
        
        car c1 = new car();
        c1.carname = "Audi";
        c1.regno = 2413;

        car c2 = new car();
        c2.carname = "BMW";
        c2.regno = 2424;

        car c3 = new car();
        c3.carname = "Minicooper";
        c3.regno = 2489;

        c3.applybreak();

        
    }
}

class car{
    String carname;
    int regno;

    void applybreak()
    {
        System.out.println("break applied " +regno);
    }
    
}