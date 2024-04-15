package stringsOps;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="listen";
         String str2="silent";
         //remove space and convert to lower case for case insensitive comparison.
         
         str1=str1.replaceAll("\\s", "").toLowerCase();
         str2=str2.replace("\\s", "").toLowerCase();
         
         char [] charArray1=str1.toCharArray();
         char [] charArray2=str2.toCharArray();
         Arrays.sort(charArray1);
         Arrays.sort(charArray2);
         
         boolean areAnagram=Arrays.equals(charArray1, charArray2);
         
         if(areAnagram) {
        	 System.out.println("the String are anagrams");
        	 
         }
         else {
        	 System.out.println("the strings are not anagrams");
         }
         
	}

}
