
public class exception {

    public static void divide(int a, int b) {
        int result;
        try {
            result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("hiiii");
        }
    }

    public static void main(String[] args) {
        divide(10, 2); // Normal division
        divide(10, 0); // Will cause an exception
    }
}
