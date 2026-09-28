  //14.DISPLAY ALL ELEMENTS USING AN ITERATOR

package nithi;
import java.util.LinkedList;
import java.util.Iterator;
public class ques14 {
	public static void main(String[] args) 
	{
		LinkedList<String>name=new LinkedList<>();
		name.add("Arun");
		name.add("Hutsun");
		name.add("Amul");
		name.add("Ibaco");
		name.add("Jammai");
		Iterator<String> ice=name.iterator();
		System.out.println("Display all elements using Iterator:");
		while(ice.hasNext())
		{
			System.out.println(ice.next());
		}
	}
}
