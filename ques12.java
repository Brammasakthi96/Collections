  //12.ADD ELEMENTS AT THE BEGINING AND END OF A LINKEDLIST

package nithi;
import java.util.LinkedList;
public class ques12 {
	public static void main(String[] args) 
	{
		LinkedList<String>fruit=new LinkedList<>();
		fruit.add("Papaya");
		fruit.add("Orange");
		fruit.add("Apple");
		System.out.println("Before add element first and last\n"+fruit);
		
		fruit.addFirst("Rasberries");
		fruit.addLast("Cherry");
		System.out.println("\nAfter add element first and last\n"+fruit);
	}
}
