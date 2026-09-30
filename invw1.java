  //INTERVIEW QUESTIONS
  //1.REMOVE DUPLICATE ELEMENTS FROM AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class invw1 {
	public static void main(String[] args) 
	{
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("Papaya");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Apple");
		System.out.println("REMOVE  DUPLCIATE ELEMENTS FROM AN ELEMENT");
		System.out.println("\nBefore removing duplicate: "+fruits);
		
		ArrayList<String>basket=new ArrayList<>();
		for(String value: fruits)
		{
			if(!basket.contains(value))
			{
				basket.add(value); 
			}
		}
		System.out.println("\n After removing duplicate: "+basket);
		}
}
