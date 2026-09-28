  //15.SEARCH FOR AN ELEMENT IN A LINKEDLIST

package nithi;
import java.util.LinkedList;
import java.util.Scanner;
public class ques15 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		LinkedList<String>emp=new LinkedList<>();
		emp.add("Arun");
		emp.add("Janani");
		emp.add("Aravind");
		emp.add("pranavi");
		emp.add("Charu");
		System.out.println("Enter the name you want to search");
		String search=sc.nextLine();
		
		if(emp.contains(search))
		{
			System.out.println(search+" is found in the LinkedList");
		}
		else
		{
			System.out.println(search+" is not found in the LinkedList");
		}
	}
}
