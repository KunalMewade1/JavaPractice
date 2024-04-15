package arrayOps;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,8,2,11,9,3,};
		int sum= calculateArraySum(array);
		System.out.println("Sum of array Elements"+sum);

	}

	private static int calculateArraySum(int[] array) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int num:array) {
		sum=num+sum;
		}
		return sum;
	}

}
