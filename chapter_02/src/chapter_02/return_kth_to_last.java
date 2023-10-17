package chapter_02;

import java.util.LinkedList;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * 
 * @author jordanprescott
 *
 */
public class return_kth_to_last {

	public static void main(String[] args) {
		
		LinkedList<Integer> linky_listy = new LinkedList<>();

		linky_listy.add(1);
		linky_listy.add(3);
		linky_listy.add(5);
		linky_listy.add(9);
		linky_listy.add(11);
		linky_listy.add(23);
		linky_listy.add(24);
		linky_listy.add(30);
		linky_listy.add(39);
		linky_listy.add(100);
		
		
		System.out.println(returnKthValue(linky_listy, 1));
		System.out.println(returnKthValue(linky_listy, 4));
		System.out.println(returnKthValue(linky_listy, 5));
		System.out.println(returnKthValue(linky_listy, 10));
		System.out.println(returnKthValue(linky_listy, 12));

	}
	
	/**
	 * 
	 * Returns kth value to last.
	 * 
	 * First gets size of list, second checks if k is greater or equal to list size in this 
	 * case the ths value to last is 0 so the function returns null. If k is less than list 
	 * size to get the kth value minus k from list_size to give remainder.
	 * 
	 * @param link_list: LinkedList of integers.
	 * @param k: Integer of position in LinkedList to find the kth to last.
	 * @return
	 */
	public static Integer returnKthValue(LinkedList<Integer> link_list, Integer k) {
		
		int list_size = link_list.size();
		
		// if k is bigger or equal to size of list each case should return null
		if (list_size == k || list_size < k) {
			return null;
		}
	
		// return the remainder from k to last
		return list_size - k;
		
	}

}
