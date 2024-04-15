package stringsOps;

public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="the quick brown fox jumps over the  lazy dog";
		String replacedString=originalString.replace("fox", "cat");
		System.out.println("Original:" +originalString);
		System.out.println("After replacement:" +replacedString);
	}

}
