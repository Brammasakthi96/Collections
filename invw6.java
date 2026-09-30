  //INTERVIEW QUES 6. COUNT THE FREQUENCY OF ELEMENTS USING HASHMAP

package nithi;
import java.util.HashMap;
public class invw6 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>name=new HashMap<>();
		name.put(101, "Reena");
		name.put(102, "Radhi");
		name.put(104, "Dev");
		name.put(105, "Arjun");
		name.put(105, "Arjun");
		name.put(103, "Raj");
		System.out.println("Names are:\n"+name);
		System.out.println("size of element: "+name.size());
	}
}
