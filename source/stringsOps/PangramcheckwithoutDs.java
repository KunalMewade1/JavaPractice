package stringsOps;

public class PangramcheckwithoutDs {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String pangram="this quick brown fox jumps over the lazy dog";
		boolean isPangram=isPangram(pangram);

		System.out.println("Is pangram?"+isPangram);
	}

	private static boolean isPangram(String pangram) {
		// TODO Auto-generated method stub
		pangram=pangram.toLowerCase();
		for(char ch='a';ch<='z';ch++) {
			if(pangram.indexOf(ch)==-1) {
				return false;
			}
		}
		return true;
	}

}
