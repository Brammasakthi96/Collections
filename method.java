//STATIC AND NON STATIC METHOD

package nithi;
import java.util.Scanner;
public class method {
	 static void add(int a,int b)        //Static method
	 {
		 int sum=a+b;
		 System.out.println("Additon: "+sum);
	 }
	 void multiply(int a,int b)         //non static method
	 {
		 int multiple=a*b;
		 System.out.println("Multiplication: "+multiple);
	 }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);               //no need to create to call the static method 
		method m=new method();  //it needs object to call the non static method
		m.multiply(a,b);
	}
}
