package chapter_01;

import java.util.Hashtable;

/**
 * 
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 * 
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 * 
 * @author jordanprescott
 *
 */
public class palindrome_permutation {

	public static void main(String[] args) {
		
		isPalindromePermutation("Tact Coa"); // true

	}
	
	public static boolean isPalindromePermutation(String my_string) {
		
		/**
		 * I need run run through the string and add in chacter and int (number of times seen) to has
		 * when I have the list there should be one odd numbered entry and the remaining should be even
		 * if this is not true then return false.
		 * 
		 */
		
		Hashtable<Integer, Character> table = new Hashtable<>();
		
		for (int i = 0; i < my_string.length(); i++) {
			
			if (my_string.charAt(i) == ' ') {
				continue;
			}
					
			char toLowerCase = Character.toLowerCase(my_string.charAt(i));
			table.put(i, toLowerCase);
		}
		
		System.out.println(table);
		
		return true;
		
	}
	
	

}
