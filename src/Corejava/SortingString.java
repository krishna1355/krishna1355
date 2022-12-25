package Corejava;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
String str="bbbcccdddaaa";
sortingString(str);
	}

	private static void sortingString(String str) {
		
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(String.valueOf(ch));
	}

}
