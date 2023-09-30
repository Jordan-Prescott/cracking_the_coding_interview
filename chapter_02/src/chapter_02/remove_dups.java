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
		
		System.out.println(cast);
		
		LinkedList<String> cast_no_duplicates = removeDuplicateWithBuffer(cast);
		System.out.println(cast_no_duplicates);
		
		LinkedList<String> cast_no_duplicates_2 = removeDuplicateNoBuffer(cast);
		System.out.println(cast_no_duplicates_2);
		
	}
	
	public static LinkedList<String> removeDuplicateWithBuffer(LinkedList<String> list) {
		
		LinkedList<String> buffer = new LinkedList<>();
		
		for(String s: list) {
			if(!buffer.contains(s)) {
				buffer.add(s);
			}
		}
		
		return buffer;
	}
	
public static LinkedList<String> removeDuplicateNoBuffer(LinkedList<String> list) {
		
		
		int list_len = list.size();
		
		
		for (int i = 0; i < list_len; i++) {
			
			list.set(0, list.getLast());
			
			for (int j = 1; j < list_len; j++) {
				if(list.get(0) == list.get(j)) {
					list.remove(j);
				}
			}

		}
				
		return list;
	}

}
