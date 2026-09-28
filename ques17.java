  //17. STORE 10 CITY NAMES IN A HASHSET AND PRINT THEM

package nithi;
import java.util.HashSet;
public class ques17 {
	public static void main(String[] args) 
	{
		HashSet<String>city=new HashSet<>();
		city.add("Chennai");
		city.add("Madurai");
		city.add("Thirunelveli");
		city.add("Pune");
		city.add("Trichy");
		city.add("Kolkata");
		city.add("Hyderabad");
		city.add("Bangalore");
		city.add("Bangalore");   //duplicate
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Chennai");     //duplicate
		System.out.println("10 City names:");
		for(String i: city)
		{
			System.out.println(i);
		}
	}
}
 