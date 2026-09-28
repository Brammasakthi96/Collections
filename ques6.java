  //6.CHECK WHETHER AN ELEMENT EXISTS IN AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class ques6 {
	public static void main(String[] args) 
	{
		ArrayList <String>emp=new ArrayList<>();
		emp.add("Raj");
		emp.add("Ram");
		emp.add("Veer");
		emp.add("Sindhu");
		emp.add("Bairavi");
		System.out.println("Employee names are: "+emp);
		if(emp.contains("Veer"))
		{
		   System.out.println("Veer exist in employee list");
		}
		else
		{
			System.out.println("Veer does not exist in employee list");
		}
	}
}
