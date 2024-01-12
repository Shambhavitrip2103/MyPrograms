package List;

import java.util.HashMap;

public class Countpairs {

	int getPairsCount(int[] arr, int n, int k) {
		int counter=0;
		HashMap<Integer,Integer> m= new HashMap<>();
		for(int i=0;i<n;i++) {
			// element should be less than sum
			
			if(arr[i]<k) {
				int element=k-arr[i];
				if(m.containsKey(element)) {
					counter+=m.get(element);
				}
				if(m.get(arr[i])==null) {
					m.put(arr[i],0);
				} 
				m.put(arr[i],m.get(arr[i])+1);
			}
		}
		return counter;
	} 
}
