public interface cars 
{
 String color();
 String seatType();
 int modelNum();
}
class bmw implements cars
{
    public String color()
    {
        return "Blue";
    }

    public String seatType()
    {
        return "Leather";
    }

    public int modelNum()
    {
        return 123;
    }
}

class car1
{
    public static void main(String[] args) {
        cars bmw = new bmw();
        System.err.println(bmw.color());
        cars audi = new audi();
        System.err.println(audi.color());
    }
}

class audi implements cars
{
    public String color()
    {
        return "Red Audi";
    }

    public String seatType()
    {
        return "seat seat";
    }

    public int modelNum()
    {
        return 888;
    } 
}