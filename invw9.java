  //INTERVEW QUES: 9. ITERATE THROUGH A HASHMAP USING ENTRYSET()

package nithi;
import java.util.HashMap;
import java.util.Map;
public class invw9 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>name=new HashMap<>();
		name.put(1, "Ram");
		name.put(2, "Priya");
		name.put(3, "Ila");
		name.put(5, "Dev");
		name.put(4, "Rosy");
		for(Map.Entry<Integer, String> entry : name.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
