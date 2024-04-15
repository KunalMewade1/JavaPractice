package arrayOps;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,4,20,3,10,5};
		int targetSum=33;
		findSubarraywithSum(array,targetSum);
		
		

	}

	private static void findSubarraywithSum(int[] array, int targetSum) {
		// TODO Auto-generated method stub
		int currentSum=0;
		int start=0;
		for(int end=0;end<array.length;end++) {
			currentSum=array[end]+currentSum;
			while(currentSum>targetSum&&start<=end) {
				currentSum=array[start]-currentSum;
				start++;
			}
			if(currentSum==targetSum) {
				System.out.println("Saubarray found from index"+start+"to"+end);
				return;
			}
		}
		System.out.println("no subarray found with the given sum");
		
	}

}
