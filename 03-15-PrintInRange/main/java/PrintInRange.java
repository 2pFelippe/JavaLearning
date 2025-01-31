
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            // Check if the number is within the range [lowerLimit, upperLimit]
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number); // Print the number
            }
        }
    }
}
