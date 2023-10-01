package chapter_02;

import java.util.LinkedList;

/**
 * 
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * 
 * EXAMPLE
 * lnput:the node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e- >f
 * 
 * @author jordanprescott
 *
 */
public class delete_middle_node {

	public static void main(String[] args) {
		
		LinkedList<Integer> linky_listy = new LinkedList<>();
		
		linky_listy.add(1);
		linky_listy.add(2);
		linky_listy.add(3);
		linky_listy.add(10);
		
		linky_listy = middleNodeRemoved(linky_listy);
		System.out.println(linky_listy);

	}
	
	/**
	 * 
	 * This solution removes all middle nodes by looping the list starting with the 
	 * first index up to but not including the last. This is achived by getting the size
	 * of the list and minus one and each time an item is removed the counter is also
	 * reduced by one to match the size of the list.
	 * 
	 * @param list
	 * @return
	 */
	public static LinkedList<Integer> middleNodeRemoved(LinkedList<Integer> list) {

		for (int i = 1; i < list.size() - 1; i++) {
			
			list.remove(i);
			i--;

		}

		return list;

	}

}
