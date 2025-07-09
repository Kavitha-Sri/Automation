class snjvCal{
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int abc, int b) {
        return abc * b;
    }
    public double multiply(int abc, double b) {
        System.out.println("snjv cal -> multiplication ");
        return abc * b;
        
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
    void move()
    {
        System.out.println("Hey I am from snjvCal");
    }
}