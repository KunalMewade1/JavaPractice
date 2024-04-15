package stringsOps;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="hello";
			char[] charArray=str.toCharArray();
			System.out.println("original String" +str);
			System.out.println("CharacterArray:");
			for(char ch:charArray)
			{
				System.out.println(ch + "");
			}
	}

}
