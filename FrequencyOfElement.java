package array;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int ar[]= {2,1,4,5,4,6,6};
		
		int temp[]=new int[ar.length];
		int c=0;
		for(int i =0;i<temp.length;i++) {
			if(temp[ar[i]]==1) {
				System.out.println(ar[i]+" ,"+ ++c);
			}else {
				temp[ar[i]]++;
			}}
		}
	}	  