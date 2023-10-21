package sandbox;

import java.util.LinkedList;
import java.util.Queue;

public class queues {

	/**
	 * 
	 * Queues follow a FIFO structure. This is the item in First in is First Out.
	 * 
	 * Adding objects to the queue is a concept called enqueue and removing objects
	 * is called dequeue.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Queue is an interface so to build a queue structure LinkedList is needed.
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Mark");
		queue.offer("Jez");
		queue.offer("Superhans");
		queue.offer("Sophie");

		System.out.println(queue);
		
		// Remove head item
		queue.poll();
		System.out.println(queue);
		
		// Checks the head of the queue without removing it
		System.out.println(queue.peek());
		
		// Checks if the queue is empty
		System.out.println(queue.isEmpty());
		
		// Returns the size of the queue
		System.out.println(queue.size());
		
		// Checks if queue contains value but doesnt return position
		System.out.println(queue.contains("Sophie"));
		
	}

}
