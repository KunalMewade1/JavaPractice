package arrayOps;

public class ElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={5,8,2,11,9,3};
		int target=11;
		int index=searchArrayElement(array,target);
		if(index!=-1) {
			System.out.println("element found at index"+index);
		}
		else {
			System.out.println("element not found in the array");
			}

	}
	private static int searchArrayElement(int[]array,int target) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

}
