package arrayOps;

public class DutchNationalFlag {



	    // Function to sort an array of 0s, 1s, and 2s
	    static void sortArray(int[] arr) {
	        int low = 0;
	        int high = arr.length - 1;
	        int mid = 0;
	        int temp;

	        while (mid <= high) {
	            switch (arr[mid]) {
	                case 0:
	                    // Swap arr[low] and arr[mid]
	                    temp = arr[low];
	                    arr[low] = arr[mid];
	                    arr[mid] = temp;
	                    low++;
	                    mid++;
	                    break;

	                case 1:
	                    mid++;
	                    break;

	                case 2:
	                    // Swap arr[mid] and arr[high]
	                    temp = arr[mid];
	                    arr[mid] = arr[high];
	                    arr[high] = temp;
	                    high--;
	                    break;
	            }
	        }
	    }

	    // Function to print the sorted array
	    static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 0, 1, 2, 1, 0, 2, 1, 0};
	        System.out.println("Original array:");
	        printArray(arr);

	        sortArray(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	}



