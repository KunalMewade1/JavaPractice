package stringsOps;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orignal="hello";
		String reverse="";
		for(int i=orignal.length()-1;i>=0;i--) {
			
			reverse=reverse+orignal.charAt(i);
		}
       System.out.println("Reverse of a sting is " + reverse);
	}

}
