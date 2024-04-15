package stringsOps;

public class CapitalizeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="java programming";
		String capitalizedSentence=capializewords(sentence);
		System.out.println("original:"+sentence);
		System.out.println("capitalized"+capitalizedSentence);
		
	}

	private static String capializewords(String sentence) {
		// TODO Auto-generated method stub
		StringBuilder result= new StringBuilder();
		String [] words=sentence.split("\\s+");
		for(String word:words) {
			result.append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1))
			.append("");
		}
		return result.toString().trim();
	}

	
}
