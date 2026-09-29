  //29. DISPLAY ALL KEYS AND VALUES FROM A HASHMAP

package nithi;
import java.util.HashMap;
public class ques29 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>flowers= new HashMap<>();
		flowers.put(01, "Jasmine");
		flowers.put(02, "Lilly");
		flowers.put(04, "Rose");
		flowers.put(03, "Olendar");
		System.out.println("flowers");
		for(Integer key: flowers.keySet())
		{
			System.out.println("key: "+key+" value: "+flowers.get(key));
		}
    }
}
