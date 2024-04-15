package stringsOps;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A man,a plan,a canal,panama!";
		boolean isValidPalindrome=isPalindrome(str);
		System.out.println("is valid palindrome?"+isValidPalindrome);

	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		return str.equals(new StringBuilder(str).reverse().toString());
	}

}
