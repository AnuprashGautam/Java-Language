//In java, if we are trying to access array element without of range index (either +ive or -ive int value) then we will get Runtime Exceptionsaying ArrayIndexOutof BoundsException. 



public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Creating an array of integers with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempting to access an element with a valid index
            System.out.println("Element at index 2: " + numbers[2]);

            // Attempting to access an element with an index that is out of range (positive)
            System.out.println("Element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            // Attempting to access an element with an index that is out of range (negative)
            System.out.println("Element at index -1: " + numbers[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
