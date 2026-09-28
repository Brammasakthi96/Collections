  //19. FIND THE SIZE OF A HASHSET

package nithi;
import java.util.HashSet;
import java.util.Scanner;
public class ques19 {
	public static void main(String[] args) 
	{
		HashSet<String>dairyitem=new HashSet<>();
		dairyitem.add("Milk");
		dairyitem.add("Butter");
		dairyitem.add("Ghee");
		dairyitem.add("Ghee");  //duplicate
		System.out.println("Without Scanner");
		System.out.println("The size of a hashset: "+dairyitem.size());
	
		//USING SCANNER
		Scanner sc=new Scanner(System.in);
		System.out.println("\nUsing Scanner");
		System.out.println("Enter 5 dairy products"); 
		HashSet<String>dairy=new HashSet<>();
		for(int i=0;i<5;i++)
		{
			dairy.add(sc.next());
		}
		System.out.println("The products are:\n"+dairy);
		System.out.println("The size of dairy products "+dairy.size());
		sc.close();
		}
	}
