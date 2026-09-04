// Exception handling with finally block

class Ex3 {
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

        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Please enter two numbers");
            System.out.println("Error: " + e1);
        }

        catch (NumberFormatException e2) {
            System.out.println("Please enter only numbers");
            System.out.println("Error: " + e2);
        }

        catch (ArithmeticException e3) {
            System.out.println("Cannot divide by zero");
            System.out.println("Error: " + e3);
        }

        finally {
            System.out.println("Program execution completed");
        }
    }
}