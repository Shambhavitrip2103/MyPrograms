package List;
import java.util.List;
import java.util.ArrayList;
public class LearnArrayList {

	public static void main(String[] args) {
	
		/*String[] studentsName = new String[30];
		studentsName[0]="Rakesh";
		//studentsname[1]....studentsname[28]
		studentsName[29]="harish";
		//new student
		studentsName[30]="raman";*/
		
		ArrayList<String> studentsName= new ArrayList();
	//	size n
	//	n+n/2+1
		studentsName.add("Rakesh");
		
		List<Integer> List= new ArrayList();
		List.add(1);
		List.add(2);
		List.add(3);
		System.out.println(List);
		List.add(4);
		System.out.println(List);
		
		List.add(1,50);           // this will add element 50 at 1st index
		System.out.println(List);
		
		List<Integer> newList =new ArrayList();// creating 
		newList.add(401);
		newList.add(79);
		List.addAll(newList);
		System.out.println(List);
		
		System.out.println(List.get(1));
				}

}
