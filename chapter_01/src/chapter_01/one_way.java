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
		
		
		System.out.println(isOneEditAway("pale", "ple")); // true
		System.out.println(isOneEditAway("pales", "pale"));
		System.out.println(isOneEditAway("pale", "bale"));
		System.out.println(isOneEditAway("pale", "bake"));
		System.out.println(isOneEditAway("pale", "bakes"));
		
		
	}
	
	public static boolean isOneEditAway(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // If the difference in lengths is more than 1, they can't be one edit away.
        if (Math.abs(len1 - len2) > 1) {
            return false;
        }

        // Ensure str1 is the shorter string.
        if (len1 > len2) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int i = 0; // Pointer for str1
        int j = 0; // Pointer for str2
        boolean foundDifference = false;

        while (i < len1 && j < len2) {
            if (str1.charAt(i) != str2.charAt(j)) {
                // If a difference is found, check if it's the first difference.
                if (foundDifference) {
                    return false; // More than one edit away.
                }
                foundDifference = true;

                if (len1 == len2) {
                    i++; // Move both pointers for equal length strings.
                }
            } else {
                i++; // Move the pointer for the shorter string.
            }
            j++; // Always move the pointer for the longer string.
        }

        return true;
    }

}
