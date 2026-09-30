  //5. INTERVIEW QUES: SORT AN ARRAYLIST WITHOUT COLLECTIONS SORT

package nithi;
import java.util.ArrayList;
public class invw5 {
	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(50);
		num.add(40);
		num.add(10);
		num.add(30);
		num.add(20);
		System.out.println("Before sorting: "+num);
		for(int i=0;i<num.size();i++)
		{
			for(int j=i+1;j<num.size();j++)
			{
				if(num.get(i)>num.get(j))
				{
					int n=num.get(i);
				    num.set(i, num.get(j));
				    num.set(j, n);
				}
			}
		}
		System.out.println("After sorting: "+num);
	}
}
