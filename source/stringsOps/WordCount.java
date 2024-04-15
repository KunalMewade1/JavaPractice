package stringsOps;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="This is the sample sentence.";
		String[] words=sentence.split("\\s+");
		int wordCount=words.length;
		System.out.println("Number of words in the String is:" + wordCount);
		
				
	}

}
