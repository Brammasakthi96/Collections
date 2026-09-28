  //20. CONVERT A HASHSET INTO AN ARRAYLIST

package nithi;
import java.util.ArrayList;
import java.util.HashSet;
public class ques20 {
	public static void main(String[] args) 
	{
		HashSet<String>dairy=new HashSet<>();
		dairy.add("Panner");
		dairy.add("Milk");
		dairy.add("Curd");
		dairy.add("Milk"); //duplicate
		System.out.println("CONVERT HASHSET INTO ARRAYLIST");
		System.out.println("HashSet: "+dairy);
		
		ArrayList<String>dairyitems=new ArrayList<>(dairy);
		System.out.println("ArrayList "+dairyitems);
		
		//CONVERT ARRAYLIST INTO HASHSET
		ArrayList<String>items=new ArrayList<>();
		items.add("Butter");
		items.add("Butter");
		items.add("Milk");
		items.add("Milk");
		System.out.println("\nCONVERT ARRAYLIST INTO HASHSET");
		System.out.println("ArrayList; "+items);
		
		HashSet<String>itm=new HashSet<>(items);
		System.out.println("HashSet: "+itm);
	}
}
