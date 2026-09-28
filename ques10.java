  //10.SORT AN ARRAYLIST IN DESCENDING ORDER

package nithi;
import java.util.ArrayList;
import java.util.Collections;
public class ques10 {
	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(1);
		num.add(58);
		num.add(47);
		num.add(1000);
		num.add(528);
		num.add(-8);
		System.out.println("Before sorting: "+num);
		Collections.sort(num,Collections.reverseOrder());
		System.out.println("After sorting in descending order: "+num);
	}
}
