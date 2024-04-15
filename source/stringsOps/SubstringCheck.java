package stringsOps;

public class SubstringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainString="Programming is fun";
		
		String substring="is";
		boolean containsSubstring=mainString.contains(substring);
		if(containsSubstring) {
			System.out.println("The String contains the substring" + substring);
			
		}
		else
		{
			System.out.println("the string doesnt contains the substring");
		}
	}

}
