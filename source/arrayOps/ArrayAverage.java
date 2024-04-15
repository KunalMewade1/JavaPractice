package arrayOps;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {5,8,2,11,9,3};
		double average=calculateArrayAverage(array);
		System.out.println("Average of array Element"+average);

	}

	private static double calculateArrayAverage(int[] array) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int num:array) {
			sum+=num;
		}
		return (double)sum/array.length;
	}

}
