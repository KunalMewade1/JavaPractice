package stringsOps;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="This is a sample sentence. This sentence is for demonstration purpose.";
		
		String[] words=sentence.split("\\s+");
		Map<String, Integer> wordFreuency= new HashMap<>();
		for(String word:words)
		{
			
			word=word.toLowerCase();
			wordFreuency.put(word, wordFreuency.getOrDefault(word, 0)+1);
		}
				
	              System.out.println("WordFrequency:" +wordFreuency);
	}

}
