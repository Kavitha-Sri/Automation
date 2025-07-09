public interface tea 
{
    int teas();
}
class teaboy implements tea
{
    public int teas()
    {
        return 10;
    }
    
}

class blackpekoe implements tea
 {
    public int teas()
    {
        return 15;
    }
    
}

class dec 
{
    public static void main(String[] args) {
    tea b = new teaboy();
    System.err.println(b.teas());

}
}

