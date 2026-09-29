  //21. STORE INTEGER VALUES IN A TREESET AND PRINT THEM IN SORTED ORDER

package nithi;
import java.util.Scanner;
import java.util.TreeSet;
public class ques21 {
	public static void main(String[] args) 
	{
		TreeSet<Integer>num=new TreeSet<>();
		System.out.println("Enter 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		num.add(sc.nextInt());
		}
		
		System.out.println("The numbers are "+num);
		}
}
