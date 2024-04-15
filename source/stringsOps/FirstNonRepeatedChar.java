package stringsOps;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		char firstNonRepeated=findfirstNonrepeatedchar(str);
		System.out.println("First non reapeted character:" + firstNonRepeated);

	}

	private static char findfirstNonrepeatedchar(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++) {
			char currentchar=str.charAt(i);
			if(str.indexOf(currentchar)==str.lastIndexOf(currentchar)) {
				return currentchar;
			}
		}
		return '\0';
	}

}
