import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int product = calculateProduct(numbers, 0);
        System.out.println("The product of the numbers is: " + product);
    }

    private static int calculateProduct(int[] numbers, int index) {
        if (index == numbers.length) {
            return 1; // Base
        }
        return numbers[index] * calculateProduct(numbers, index + 1); // Recursive
    }
}
