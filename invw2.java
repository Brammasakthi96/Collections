  //2. FIND DUPLICATE ELEMENTS IN AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class invw2 {
	public static void main(String[] args) 
	{
		ArrayList<String>names=new ArrayList<>();
		names.add("Tej");
		names.add("Pavi");
		names.add("Pavi");
		names.add("Ved");
		names.add("Ved");
		names.add("Raju");
		names.add("Oviya");
		System.out.println("TO FIND DUPLICATE ELEMENT IN AN ARRAYLIST");
		System.out.println("\nBefore removing duplicates: "+names);
		System.out.println("The duplicate elements: ");
		for(int i=0;i<names.size();i++)
		{
			for(int j=i+1;j<names.size();j++)
			{
				
				if(names.get(i).equals(names.get(j)))
						{
					      System.out.println(names.get(i));
					      names.remove(i);
					   	}
			}
		}
		System.out.println("After removing duplicates: "+names);
	}
}
