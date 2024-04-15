package stringsOps;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="radar";
		String reversed= new StringBuilder(str).reverse().toString();
		boolean isPalindrome=str.equals(reversed);
		
		System.out.println("is Palindrome?" + isPalindrome);

	}

}
