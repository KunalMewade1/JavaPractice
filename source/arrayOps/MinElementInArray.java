package arrayOps;

public class MinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {5,8,2,11,9,1};
		int min=findMinElement(array);
		System.out.println("minimum element"+min);

	}

	private static int findMinElement(int[] array) {
		// TODO Auto-generated method stub
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}

	
}
