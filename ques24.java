  //24. REMOVE A SPECIFIC ELEMENT FROM A TREESET

package nithi;
import java.util.Scanner;
import java.util.TreeSet;
public class ques24 {
	public static void main(String[] args) 
	{
		TreeSet<Integer>num=new TreeSet<>();
		System.out.println("Enter 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		num.add(sc.nextInt());
		}
		System.out.println("TreeSet numbers:"+num);
		System.out.println("\nEnter the number you want to remove");
		int n=sc.nextInt();
		if(num.remove(n))
		{
			System.out.println(n+" The number is removed");
		}
		else
		{
			System.out.println(n+" The number is not in the TreeSet");
		}
			System.out.println("\nAfter remove the TreeSet: "+num);
		}
}
