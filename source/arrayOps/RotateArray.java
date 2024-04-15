package arrayOps;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int steps = 2;

        System.out.println("Original Array: ");
        printArray(array);

        // Rotate the array to the right
        rotateRight(array, steps);

        System.out.println("\nArray after rotating to the right by " + steps + " steps: ");
        printArray(array);
    }

    // Function to rotate the array to the right by 'steps' steps
    private static void rotateRight(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length; // Ensure steps is less than the length of the array

        // Create a temporary array to store rotated elements
        int[] temp = new int[length];

        // Copy elements to temp array
        for (int i = 0; i < length; i++) {
            temp[(i + steps) % length] = arr[i];
        }

        // Copy elements back to the original array
        for (int i = 0; i < length; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
