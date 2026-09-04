// no exception handling
// finally block will execute whether error comes or not

class Ex2 {
    public static void main(String[] args) {
        try {
            String s1 = args[0];
            String s2 = args[1];

            System.out.println(s1 + " " + s2);

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Addition = " + (a + b));
            System.out.println("Division = " + (a / b));
            System.out.println("Multiplication = " + (a * b));
        }
        catch (Exception e) {
            System.out.println("Please enter two numbers to add and divide");
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Program execution completed");
        }
    }
}