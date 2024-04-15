package stringsOps;

public class PalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbaacc";
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				
				String substring=str.substring(i, j);
				
				if(isPalindromic(substring)) {
					count++;
					System.out.println(substring);
				}
			}
		}
			System.out.println("Total palindromic substring" +count);
	}

	private static boolean isPalindromic(String s) {
		// TODO Auto-generated method stub
		return s.equals(new StringBuilder(s).reverse().toString());
	}

}
