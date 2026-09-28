//8.REVERSE AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class ques8 {
	public static void main(String[] args) 
	{
		ArrayList<String>name= new ArrayList<>();
		name.add("Arun");
		name.add("Lavanya");
		name.add("Lilly");
		name.add("Rosy");
		System.out.println("Original ArrayList: "+name);
		System.out.println("Reversed ArrayList");
		for(int i=name.size()-1;i>=0;i--)
		{
			System.out.println(name.get(i));
		}
	}
}
