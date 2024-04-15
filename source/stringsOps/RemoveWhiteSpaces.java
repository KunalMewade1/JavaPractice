package stringsOps;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String input="Hello, world!";
		String withoutWhiteSpaces=input.replaceAll("\\s", "");
		System.out.println("original"+ input);
		System.out.println("withoutwhitespaces" + withoutWhiteSpaces);

	}

}
