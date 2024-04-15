package arrayOps;

public class ArraySortedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array1[]= {1,2,3,4,5};
			int[]array2= {7,2,9,10,15};
			System.out.println("Is array1 is sorted?"+isArraySorted(array1));
			System.out.println("Is array2 is sorted?"+isArraySorted(array2));
	}

	private static boolean isArraySorted(int[] array) {
		// TODO Auto-generated method stub
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				return false;
			}
		}
	
		return true;
	}

}
