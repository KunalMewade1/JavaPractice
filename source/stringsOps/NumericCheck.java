package stringsOps;

public class NumericCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numericString="12345";
		
		boolean isNumberic=isNumeric(numericString);
		System.out.println("Is NUmeric?"+ isNumberic);

	}

	private static boolean isNumeric(String str) {
		// TODO Auto-generated method stub
		return str.matches("\"-?\\\\d+(\\\\.\\\\d+)?\"");
		// Handles integers and floating-point numbers
    }
	}


