   //1.CREATE AN ARRAYLIST ADD 10 STUDENT NAMES AND PRINT ALL NAMES

package nithi;
import java.util.ArrayList;

public class ques1 {

	public static void main(String[] args) {
		ArrayList<String>student=new ArrayList<>();
		student.add("gayu");
		student.add("divya");
		student.add("priya");
		student.add("ravi");
		student.add("farina");
		student.add("yazhini");
		student.add("pavi");
		student.add("abi");
		student.add("madhu");
		System.out.println("Student name");
		for(String i:student)
		{
			System.out.println(i);
		}
	}

}
