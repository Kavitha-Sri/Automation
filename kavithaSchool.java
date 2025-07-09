public abstract class kavithaSchool {

    String school()
    {
return "school name is JBS";
    }

    int contactNum()
    {
        return 9910;
    }

    abstract String guestname();

}
class function extends kavithaSchool
{
   String guestname()
   {
    return "snjv";
   }
}
class execute
{
    public static void main(String[] args) {
        function a = new function();
        System.err.println(a.guestname());
    }
}