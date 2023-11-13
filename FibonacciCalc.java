public class FibonacciCalculator {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Calculate the 10th Fibonacci number
        int result = fibonacci(15);
        System.out.println("The 10th Fibonacci number is: " + result);
    }
}
