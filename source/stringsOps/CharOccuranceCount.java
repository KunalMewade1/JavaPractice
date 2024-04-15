package stringsOps;

public class CharOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		char targetchar='g';
		
		int occuranceCount=countOccurences(str,targetchar);
		System.out.println("occrence of '" + targetchar +"':"+ occuranceCount);

	}

	private static int countOccurences(String str, char targetchar) {
		// TODO Auto-generated method stub
		int count=0;
		for(char ch:str.toCharArray())
		{
			if(ch==targetchar)
			{
				count++;
			}
		}
		return count;
	}

}
