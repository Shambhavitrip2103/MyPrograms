package List;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
	//	Map<String , Integer> numbers = new HashMap<String , Integer>();
		Map<String , Integer> numbers = new TreeMap<String , Integer>(); // sorted form all values on basis of key - one , five (alphabetical order
		
		numbers.put("One",1);
		numbers.put("two",2);
		numbers.put("three",3);
		 //numbers.put("two", 23);//keys are unique , no second value if value override
		numbers.put("four",4);
		numbers.put("five",5);
		
		String key;
		numbers.remove(key="three");
	/*	if(!numbers.containsKey("two")) {
			numbers.put("two",23);
		}*/
		
	//	numbers.putIfAbsent("two",23);
		
		System.out.println(numbers);
	/*	for(Map.Entry<String,Integer>e: numbers.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(String key: numbers.keySet()) {
			System.out.println(key);
		}

		for(Integer value: numbers.values()) {
			System.out.println(value);
		}   */
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
		}

}
