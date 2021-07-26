package AllPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String string = "ice";
		String string2= "ratik";
		char[] array1=string.toLowerCase().toCharArray();
		char[] array2=string2.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1, array2)) {
			System.out.println("string are anagrams");
		}else {
			System.out.println("string are not anagram");
		}
	}
}
