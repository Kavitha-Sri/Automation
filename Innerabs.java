public interface Innerabs {

    
} 
abstract class abs {
    abstract int age();
    abstract String name();
    abstract int guestnum();
       
}

class bus extends abs
{
    public int age()
    {
        return 24;
    }
    String name()
    {
        return "kavi";
    }
    int guestnum()
    {
        return 82;
    }

}
 class busses {

    public static void main(String[] args) {
        bus b = new bus();
        System.out.println(b.age());
    }
}