package chapter_01;

/**
 * 
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * 
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 * 
 * @author jordanprescott
 *
 */
public class one_way {

	public static void main(String[] args) {
		
		one_edit_away("pale", "ple"); // true
		one_edit_away("pales", "pale"); // true
		one_edit_away("pale", "bale"); // true
		one_edit_away("pale", "bake"); // true
		
		
	}
	
	/**
	 * 1. Loop through each index in string 
	 * 2. Perform each action on index and compare to value 
	 * 3. Return true if one move away
	 */
	public static boolean one_edit_away(String foo, String bar) {
		
		int length = foo.length();

		for (int i = 0; i < length; i++) {
		    char character = foo.charAt(i);

		    // Perform actions and check here 
		    
		    
		}		
		
		return false;
		
	}

}
