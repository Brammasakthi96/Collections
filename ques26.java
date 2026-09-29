  //26. CREATE A HASHMAP TO STORE STUDENT ID AND STUDENT NAME

package nithi;
import java.util.HashMap;
public class ques26 {
	public static void main(String[] args) 
	{
		HashMap<Integer,String>student=new HashMap<>();
		student.put(101, "Amritha");
		student.put(102, "Zayana");
		student.put(104, "elan");
		student.put(105, "Ayal");
		student.put(103, "Pranvi");
		System.out.println("Student ID and Name: "+student);
	}
}
