package arrayOps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {3,8,12,16,5,4};
		int targetSum=20;
		System.out.println("Original Array"+Arrays.toString(array));
		findPairWithSum(array,targetSum);
		

	}

	private static void findPairWithSum(int[] array, int targetSum) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		for(int num:array)
		{
			int complement=targetSum-num;
			if(set.contains(complement)) {
				System.out.println("Pair with Sum"+targetSum+":("+num+","+complement+")");
				return;
			}
			set.add(num);
		}
		 System.out.println("No Pair found with the given sum");
		
	}
  
}
