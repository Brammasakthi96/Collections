  //4.CONVERT HASHSET INTO ARRAYLIST

package nithi;
import java.util.ArrayList;
import java.util.HashSet;
public class invw4 {
	public static void main(String[] args) 
	{
		HashSet<String>pets=new HashSet<>();
		pets.add("Cow");
		pets.add("Dog");
		pets.add("Dog");  //duplicate
		pets.add("Parrot");
		pets.add("Parrot");  //duplicate
		System.out.println("CONVERT HASHSET INTO ARRAYLIST");
		System.out.println("-------------------------------");
		System.out.println("HashSet: "+pets);
		
		ArrayList<String>pet=new ArrayList<>(pets);
		System.out.println("ArrayList: "+pet);
	}
}
