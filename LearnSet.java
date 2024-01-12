package List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// inside set duplicate elements are not allowed
		//Set<Integer> set= new HashSet<Integer>();
		//Set<Integer> set= new LinkedHashSet<Integer>(); // inthis values are print in same 
		//order as given no randomness
		Set<Integer> set= new TreeSet<Integer>(); //  in this the elements are sorted as well in order
		
		set.add(23);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);// order of the number is not decided it varies everytime , internally hash 
		//             cgal ra h , always random value
		
		set.add(54);// already present no further display
		System.out.println(set);
		
		int o;
		set.remove(o=54);
		System.out.println(set);
		
		System.out.println(set.contains(100));
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set);
		
	}

}
