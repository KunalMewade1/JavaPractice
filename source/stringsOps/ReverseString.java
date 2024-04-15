package stringsOps;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Hello";
		String reversed=new StringBuilder(original).reverse().toString();
		System.out.println(reversed);
	}

}
