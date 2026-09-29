  //25. DISPLAY ELEMENTS IN DESCENDING ORDER USING A TREESET

package nithi;
import java.util.TreeSet;
public class ques25 {
	public static void main(String[] args) 
	{
		TreeSet<String>animal=new TreeSet<>();
		animal.add("Zebra");
		animal.add("Hippo");
		animal.add("Raccon");
		System.out.println("The animals name: \n"+animal);
		System.out.println("\n The animals name in Descending order:\n"+animal.descendingSet());
	}
}
