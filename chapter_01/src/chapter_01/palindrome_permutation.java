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
		
		System.out.println(isPalindromePermutation("Tact Coa"));
		System.out.println(isPalindromePermutation("Abba"));
		System.out.println(isPalindromePermutation("Bernard"));

	}
	
	public static boolean isPalindromePermutation(String my_string) {
		
		/**
		 * I need run through the string and add in chacter and int (number of times seen) to has
		 * when I have the list there should be one odd numbered entry and the remaining should be even
		 * if this is not true then return false.
		 * 
		 */
		
		Hashtable<Character, Integer> table = new Hashtable<>();
		
		for (int i = 0; i < my_string.length(); i++) {
			
			if (my_string.charAt(i) == ' ') {
				continue;
			}
					
			char char_lower_case = Character.toLowerCase(my_string.charAt(i));
			
			if (!table.containsKey(char_lower_case)) {
				table.put(char_lower_case, 1);
			} else {
				int table_entry = table.get(char_lower_case);
				table.replace(char_lower_case, table_entry + 1);
			}
		}
		
		int odd_total = 0;
		
		for (Character key : table.keySet()) {
		    
			int value = table.get(key);
		    
			if (!(value % 2 == 0)) {
			   ++odd_total;
			}
			
		}
		
		if (odd_total > 1) {
			return false;
		}
		
		return true;
		
	}
	
}
