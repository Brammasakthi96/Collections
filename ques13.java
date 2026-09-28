  //13.REMOVE THE FIRST AND LAST ELEMENTS FROM A LINKEDLIST

package nithi;
import java.util.LinkedList;
public class ques13 {
	public static void main(String[] args) 
	{
		LinkedList<String>veg=new LinkedList<>();
		veg.add("Carrot");
		veg.add("Beetroot");
		veg.add("Beans");
		veg.add("Drumstick");
		veg.add("Okra");
		System.out.println("Before remove the first and last element:\n"+veg);
		
		veg.removeFirst();
		veg.removeLast();
		
		System.out.println("\nAfter remove the first and last element:\n"+veg);
	}
}
