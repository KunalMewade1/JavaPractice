package arrayOps;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] array= {3,1,4,4,2,2,5};
            int k=3;
            System.out.println("original array:"+Arrays.toString(array));
            int kthLargest=findKthLargestElement(array,k);
            System.out.println("the"+k+"thlargest elements"+kthLargest);
	}

	private static int findKthLargestElement(int[] array, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		
		return array[array.length-k];
	}

}
