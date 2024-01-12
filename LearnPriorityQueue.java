package List;
import java.util.PriorityQueue;
public class LearnPriorityQueue {

	public static void main(String[] args) {
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
				
		int e;
		pq.offer(e=40);
		pq.offer(e=12);
		pq.offer(e=24);
		pq.offer(e=36);
		
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}

}
