package chapter_02;

import java.util.LinkedList;

/**
 *
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * @author jordanprescott
 *
 */
public class remove_dups {

	public static void main(String[] args) {
		
		LinkedList<String> cast = new LinkedList<>();
		
		cast.add("Mark");
		cast.add("Jez");
		cast.add("Super hans");
		cast.add("Dobbie");
		cast.add("Gerrard");
		cast.add("Sophie");
		cast.add("Sophie");
		cast.add("Sophie");
		
		
		System.out.println(cast);
		
		LinkedList<String> cast_no_duplicates = removeDuplicateWithBuffer(cast);
		System.out.println(cast_no_duplicates);
		
		LinkedList<String> cast_no_duplicates_2 = removeDuplicateNoBuffer(cast);
		System.out.println(cast_no_duplicates_2);
		
	}
	
	
	/**
	 * 
	 * This solution loops the current list and if the item is not in the new linkedlist 
	 * used as a buffer it is then added. After looping through all items the new linked 
	 * list is returned where the current list can be updated to the new one.
	 * 
	 * @param list
	 * @return
	 */
	public static LinkedList<String> removeDuplicateWithBuffer(LinkedList<String> list) {
		
		LinkedList<String> buffer = new LinkedList<>();
		
		for(String s: list) {
			if(!buffer.contains(s)) {
				buffer.add(s);
			}
		}
		
		return buffer;
	}
	
/**
 * 
 * Loops through list and then nested loop loops through remaining item by starting 
 * at the next index from current word in list. If the two values at i and j (index)
 * are the same value at j is removed. The counter j is then reduced by one for the 
 * removed item and so that the next item is not misssed.
 * 	
 * @param list
 * @return list with no duplicates
 */
public static LinkedList<String> removeDuplicateNoBuffer(LinkedList<String> list) {
	
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				
				if (list.get(i) == list.get(j)) {
					
					list.remove(j);
					
					j--;
				
				}
			}
		}
				
		return list;
	}

}
