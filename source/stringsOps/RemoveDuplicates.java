package stringsOps;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		String withoutDuplicates=removeDuplicates(str);
		
		System.out.println("Original" + str);
		System.out.println("without duplicates" + withoutDuplicates);

	}

	private static String removeDuplicates(String str) {
		// TODO Auto-generated method stub
		StringBuilder result= new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			char currentchar=str.charAt(i);
		if(result.indexOf(String.valueOf(currentchar))==-1) {
			result.append(currentchar);
		}
		}
		return result.toString();
	}

}
