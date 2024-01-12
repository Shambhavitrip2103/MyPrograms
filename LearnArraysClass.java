package List;
import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		
	/*	int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		int key;
		int index= Arrays.binarySearch(numbers, key=4);
		System.out.println("the index of element 4 in the array is"+ index);  */
		
		Integer[] numbers= {10,2,32,12,15,76,17,48,79,90};
				Arrays.sort(numbers);
				//8192 if more than these values in array parallel sort works
				for(int i:numbers) {
					System.out.print(i+" ");
				}
		}
		}


