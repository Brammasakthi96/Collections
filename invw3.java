  //3. CONVERT ARRAYLIST INTO HASHSET

package nithi;
import java.util.ArrayList;
import java.util.HashSet;
public class invw3 {
	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(500);
		num.add(-1);
		num.add(-1);  //duplicate
		num.add(30);
		num.add(30); //duplicate
		System.out.println("CONVERT ARRAYLIST INTO HASHSET");
		System.out.println("-------------------------------");
		System.out.println("ArrayList: "+num);
		
		HashSet<Integer>number=new HashSet<>(num);
		System.out.println("HashSet: "+number);
	}
}
