package stringsOps;

public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pangram="The quick brown fox jumps over the lazy dog";
		boolean isPangram=isPangram(pangram);
		
		System.out.println("Is pangram?"+isPangram);
		

	}

	private static boolean isPangram(String pangram) {
		// TODO Auto-generated method stub
		pangram=pangram.toLowerCase().replaceAll("[^a-z]", "");
		return pangram.chars().distinct().count()==26;
	}

}
