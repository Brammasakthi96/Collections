  //9.SORT AN ARRAYLIST IN ASCENDING ORDER

package nithi;
import java.util.ArrayList;
import java.util.Collections;
public class ques9 {
	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(14);
		num.add(-5);
		num.add(5);
		num.add(1000);
		num.add(75);
		System.out.println("Before Sorting: "+num);
        Collections.sort(num);
		System.out.println("After Sorting: "+num);
	}
}
