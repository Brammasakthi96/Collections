  //30. COUNT THE TOTAL NUMBER OF ENTRIES IN A HASHMAP

package nithi;
import java.util.HashMap;
public class ques30 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>pets=new HashMap<>();
		pets.put(10, "Dog");
		pets.put(20, "Cat");
		pets.put(30, "Cow");
		pets.put(50, "Cock");
		pets.put(40, "Donkey");
		System.out.println("Pets name: "+pets);
		System.out.println("\nCount the total number of entries: "+pets.size());
	}
}
