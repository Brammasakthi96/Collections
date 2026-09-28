  //3.FIND THE LARGEST  ELEMENT IN AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class ques3 {	
	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(30);
		num.add(100);
		num.add(1);
		num.add(37);
		num.add(500);
		System.out.println("Find the largest element "+num);
		int large=num.get(0);
		for(int i:num)
		{
			if(i>large)
			{
				large = i;
			}
		}
			System.out.println("The largest number in the element: "+large);
		}
	
	

	}


