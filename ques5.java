  //5.REMOVE A SPECIFIC ELEMENT FROM AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class ques5 {
	public static void main(String[] args) 
	{
		ArrayList<String>names=new ArrayList<>();
		names.add("Sidharth");
		names.add("Nithya");
		names.add("Vasantha");
		names.add("Saranya");
		names.add("Vidya");
		System.out.println("Before removing names: "+names);
		names.remove("Saranya");
		System.out.println("After removing Saranya: "+names);
	}

}
