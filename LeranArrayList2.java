package List;
import java.util.List;
import java.util.ArrayList;
public class LeranArrayList2 {

	public static void main(String[] args) {

		List<Integer> List= new ArrayList();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(7);
		List.add(90);
		List.add(47);
		List.add(72);
		System.out.println(List); // removing element, time comp= big(O)n ,adding inserting element, time comp= big(O)n
		
		List.set(2,1000);
		System.out.println(List);
		
		System.out.println(List.contains(50));
		
		List.remove(1);// this will remove value of index 1
		System.out.println(List);
		
		List.remove(Integer.valueOf(3));
		System.out.println(List);
		
		List.clear(); //this will remove all the elemnts from
		System.out.println(List);
	}
	
}
