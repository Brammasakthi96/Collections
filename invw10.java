  //INTERVIEW QUES 10. COMPARE ARRAYLIST AND LINKEDLIST PERFORMANCE

package nithi;
import java.util.ArrayList;
import java.util.LinkedList;
public class invw10 {
	public static void main(String[] args) 
	{
		int n=10000;
		ArrayList<Integer>array=new ArrayList<>();
		LinkedList<Integer>link=new LinkedList<>();
		
		for(int i=0;i<n;i++)
		{
			array.add(i);
			link.add(i);
		}
		//ArrayList
		long start1=System.nanoTime();
		for(int i=0;i<n;i++)
		{
			array.get(i);
		}
		long end1=System.nanoTime();
		
		//linkedList
		long start2=System.nanoTime();
		for(int i=0;i<n;i++)
		{
			link.get(i);
		}
		long end2=System.nanoTime();
		System.out.println("ArrayList get() time: "+(end1-start1)+"ns");
		System.out.println("LinkedList get() time: "+(end2-start2)+"ns");
	}
}
