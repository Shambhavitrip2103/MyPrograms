package array;

import java.util.Scanner;

public class SmallestNumberOfArray {

	public static void main(String[] args) {
		 System.out.println("enter the elements");
		Scanner sc=new Scanner(System.in);
		
		int arr[] = new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=1;i<6;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			 
		} System.out.println("the smallest element of array "+ small);
		
	}
}
