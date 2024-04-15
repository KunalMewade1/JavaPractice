package arrayOps;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,2,4,3,6,7,8};
		int missingNumber=findMissingNumber(array);
		System.out.println("Missing Number is "+missingNumber);

	}

	private static int findMissingNumber(int[] array) {
		// TODO Auto-generated method stub
		int n=array.length+1;
		int expectedSum=n*(n+1)/2;
		int actualSum=0;
		for(int num:array)
		{
			actualSum=actualSum+num;
			
		}
		return expectedSum-actualSum;
	}

}
