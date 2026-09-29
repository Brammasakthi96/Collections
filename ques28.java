  //28. CHECK WHETHER A KEY EXISTS IN A HASHMAP

package nithi;
import java.util.HashMap;
import java.util.Scanner;
public class ques28 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>student=new HashMap<>();
		student.put(101, "Arya");
		student.put(104, "Janani");
		student.put(103, "Sruthi");
		student.put(102, "Gayu");
		System.out.println("which key you want to check is exist or not");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		if(student.containsKey(key))
		{
			System.out.println("Key exists. Student name: "+student.get(key));
		}
		else
		{
			System.out.println("The key does not exist");
		}
		}
}
