  //23.FIND THE FIRST AND LAST ELEMENT IN A TREESET

package nithi;
import java.util.Scanner;
import java.util.TreeSet;
public class ques23 {
	public static void main(String[] args) 
	{
		TreeSet<String>names=new TreeSet<>();
		System.out.println("Enter 5 names");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			names.add(sc.nextLine());
		}
		System.out.println("The names: "+names);
		System.out.println("The first name: "+names.first());
		System.out.println("The Last name: "+names.last());

	}

}
