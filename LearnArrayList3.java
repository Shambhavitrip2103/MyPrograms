package List;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LearnArrayList3 {

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
		System.out.println(List);
		
		for(int i=0;i<List.size();i++) {
			System.out.println("the element is" +List.get(i));
		}
		for(Integer element:List) {
			System.out.println("foreach element is"+ element);
		}
		Iterator<Integer> it= List.iterator();
		while (it.hasNext()) {
		System.out.println("iterator"+ it.next());
		}
	}

}
