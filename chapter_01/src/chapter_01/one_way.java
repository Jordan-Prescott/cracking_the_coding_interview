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
		one_edit_away("pale", "bakes"); // true
		
	}
	
	public static boolean one_edit_away(String foo, String bar) {
				
		char[] string_1 = foo.toCharArray();
		char[] string_2 = bar.toCharArray();
		
		int string_1_length = string_1.length;
		int string_2_length = string_2.length;
		
		if(string_1_length > string_2_length) { // remove char
			
			for (int i = 0; i < string_1_length; i++) {
				System.out.println("");
			}
			
		} else if(string_1_length < string_2_length) { // add char

			System.out.println("add");
			
		} else if(string_1_length == string_2_length) {

			System.out.println("replace"); // replace char
			
		} else {

			System.out.println("miss");
			
		}
		
		return false;
		
	}
	
	public static boolean strings_match(CharArray string_1, CharArray string_2) {
		
	}

}
