import java.util.Scanner;

public class ReadArrayFromKeyboard {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 3: Create the array of the specified size
        int[] array = new int[size];

        // Step 4: Use a loop to read the data into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 5: Print the array elements to verify the input
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
