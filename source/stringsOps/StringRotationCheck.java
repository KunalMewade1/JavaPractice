package stringsOps;

public class StringRotationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="lohel";
		boolean isRotation=isRotation(str1,str2);
		System.out.println("is str2 is roations of str1?" + isRotation);

	}

	private static boolean isRotation(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length()!=str2.length()) {
			return false;
		}
		String concatenated=str1+str2;
		return concatenated.contains(str2);
	}

}
