package List;
import java.util.ArrayDeque;
public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq= new ArrayDeque<Integer>();
		
		int e;
		adq.offer(e=23);
		adq.offerFirst(e=12);
		adq.offerLast(e=45);
		adq.offer(e=26);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());//firstelement
		System.out.println("poll()"+adq);
		
		System.out.println(adq.pollFirst());//firstelement
		System.out.println("pollFirst()"+adq);
		
		System.out.println(adq.pollLast());
		System.out.println("pollLast()"+adq);
	}

}
