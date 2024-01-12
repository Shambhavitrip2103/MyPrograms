package List;
import java.util.Queue;
import java.util.LinkedList;
public class LearnQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int e;
		queue.offer(e=12);
		queue.offer(e=24);
		queue.offer(e=36);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		
	}

}
