package arrayOps;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={0,2,0,3,0,4,0,5};
		System.out.println("Original Array"+Arrays.toString(array));
		moveZerosToEnd(array);
		System.out.println("Array after moving to the end"+Arrays.toString(array));

	}

	private static void moveZerosToEnd(int[] array) {
		// TODO Auto-generated method stub
		int nonZeroIndex=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				int temp=array[nonZeroIndex];
				array[nonZeroIndex++]=array[i];
				array[i]=temp;
			}
		}
		
	}

}
