package stringsOps;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strings= {"flower","flow","flight"};
		String commonPrefix=findLongestCommonPrefix(strings);
		System.out.println("longest common prefix"+commonPrefix);

	}

	private static String findLongestCommonPrefix(String[] strings) {
		// TODO Auto-generated method stub
		if (strings == null || strings.length == 0) {
            return "";
        }
		String prefix=strings[0];
		for(int i=1;i<strings.length;i++) {
			while(strings[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		return  prefix;
	}

}
