package arrayOps;

public class MaxelementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5,8,2,11,9,3};
		int max=findMaxElement(array);
		System.out.println("maximum element"+max);

	}

	private static int findMaxElement(int[] array) {
		// TODO Auto-generated method stub
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		return max;
	}
    
    
	}

