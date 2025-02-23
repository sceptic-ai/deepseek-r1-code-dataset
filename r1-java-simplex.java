// This code finds the maximum element in an array of integers.

public class MaxElementFinder {
    /**
     * Find the maximum element in an array.
     *
     * @param array The array of integers.
     * @return The maximum element in the array.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int max = array[0]; // Assume the first element is the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    // Example usage
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5};
        int maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }
}
