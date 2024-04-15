package arrayOps;



public class MergeSortedArrays {
	public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10, 12};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Printing the merged array
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        // Merge elements from both arrays in sorted order
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy the remaining elements from arr1, if any
        while (i < len1) {
            result[k++] = arr1[i++];
        }

        // Copy the remaining elements from arr2, if any
        while (j < len2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
	}


