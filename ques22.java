  //22. STORE EMPLOYEE IDS IN A TREESET AND DISPLAY THEM

package nithi;
import java.util.TreeSet;
public class ques22 {
	public static void main(String[] args) 
	{
		TreeSet<Integer>empid=new TreeSet<>();
		empid.add(105);
		empid.add(145);
		empid.add(254);
		empid.add(47);
		empid.add(43);
		System.out.println("Employee IDs:");
		for(int i:empid)
		{
			System.out.println(i);
		}
	}
}
