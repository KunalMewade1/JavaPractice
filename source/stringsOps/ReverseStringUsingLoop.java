package stringsOps;

public class ReverseStringUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String reversed="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reversed=ch+reversed;
			}
		System.out.println("Reverse of a string is" + reversed);
		
		

	}

}
