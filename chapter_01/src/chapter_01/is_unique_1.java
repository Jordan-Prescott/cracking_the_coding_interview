package chapter_01;

import java.util.ArrayList;

/**
 * 
 * Question. Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data structures?
 * 
 * @author jordanprescott
 *
 */

public class is_unique_1 {

	public static void main(String[] args) {

		String str1 = "foo"; // not unique
		String str2 = "bar"; // unique

		System.out.println(hasUniqueCharactersDataStructures(str1)); // return true
		System.out.println(hasUniqueCharactersDataStructures(str2)); // return false
		
		System.out.println(hasUniqueCharactersNoDataStructures(str1)); // true
		System.out.println(hasUniqueCharactersNoDataStructures(str2)); // false
		
	}

	/**
	 * 
	 * Creates a new array and then loops through characters of the string. With each 
	 * character it is checked if it already exists in the array and if so this means the string
	 * does not have unique characters and returns true. If the letter is not found in the list it
	 * is added.
	 * 
	 */
	public static Boolean hasUniqueCharactersDataStructures(String s) {

		ArrayList<String> letters = new ArrayList<>();

		for (char character : s.toCharArray()) {
			if (letters.contains(String.valueOf(character))) {
				return true;
			}
			letters.add(String.valueOf(character));

		}

		return false;

	}

	/**
	 * 
	 * First the length of the string is saved to n, this gives us how many characters are in the string
	 * and gives us the max index. A loop then run through the range of n and a nested loop is added 
	 * at each value. The nested loop starts from i + 1 this is the next value from the current. There is
	 * then a check that the characters of i and j are of equal value and if so this returns true.
	 * 
	 */
	public static Boolean hasUniqueCharactersNoDataStructures(String s) {

		int n = s.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return true;
				}
			}

		}

		return false;

	}

}
