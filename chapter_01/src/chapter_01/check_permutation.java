package chapter_01;

import java.util.Arrays;

/**
 * 
 * Question.
 * Given two strings, write a method to decide if one is permutation of the other.
 * 
 * @author jordanprescott
 *
 */
public class check_permutation {

		public static void main(String[] args) {
			

			System.out.println(string_is_permutation("silent", "listen")); // return True
			System.out.println(string_is_permutation("melon", "lemon")); // return True
			System.out.println(string_is_permutation("foo", "bar")); // return False
			

		}
		
		public static boolean string_is_permutation(String x, String y) {
			
			// first check length of strings are equal
			if(x.length()!= y.length()) {
				return false;
			}
			
			// create array of characters
			char[] array1 = x.toCharArray();
			char[] array2 = y.toCharArray();
			
			
			// by sorting alphabetically if the strings are permutation of each other
			// the array will be the same.
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			return Arrays.equals(array1, array2);
			
		}

}
