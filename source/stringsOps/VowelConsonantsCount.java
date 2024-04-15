package stringsOps;

public class VowelConsonantsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Hello worlds!";
		int vowelCount=0;
		int consonantCount=0;
		text=text.toLowerCase();
		
		for(char ch:text.toCharArray()) {
			if(ch>='a'&& ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
				
			}
		}
		System.out.println("Vowel:" + vowelCount);
		System.out.println("Consonants:" + consonantCount);

	}

}
