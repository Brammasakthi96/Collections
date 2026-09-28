 //16. CREATE A HASHSET AND ADD DUPLICATE VALUES OBSERVE THE OUTPUT

package nithi;
import java.util.HashSet;
public class ques16 {
	public static void main(String[] args) 
	{
		HashSet<String>workers=new HashSet<>();
		workers.add("Raghav");
		workers.add("Teju");
		workers.add("Rahul");
		workers.add("Ram");
		workers.add("lakshmi");
		
		workers.add("Raghav"); //duplicate value
		workers.add("Teju");   //duplicate value
		System.out.println(workers);
	}
}
