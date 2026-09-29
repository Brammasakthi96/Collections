  //27. RETRIEVE A VALUE USING A KEY FROM A HASHMAP

package nithi;
import java.util.HashMap;
import java.util.Scanner;
public class ques27 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>birds=new HashMap<>();;
		birds.put(2, "Seagull");
		birds.put(3, "Cockatoo");
		birds.put(4,"Swan");
		birds.put(1, "Parrot");
		System.out.println("Birds name: \n"+birds);
		System.out.println("Enter the key value you want to retrieve");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		String value=birds.get(key);
	    System.out.println("Birds name: "+value);
	}
}
