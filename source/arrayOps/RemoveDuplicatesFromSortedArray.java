package arrayOps;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7};

        int length = removeDuplicates(sortedArray);

        // Printing the array after removing duplicates
        System.out.println("Array without duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                // Move to the next unique element
                uniqueIndex++;
                // Replace the next unique element with the current non-duplicate element
                nums[uniqueIndex] = nums[i];
            }
        }

        // The length of the array without duplicates is (uniqueIndex + 1)
        return uniqueIndex + 1;
    }

}
