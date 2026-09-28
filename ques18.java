  //18. CHECK WHETHER A SPECIFIC ELEMENT EXISTS IN A HASHSET

package nithi;

import java.util.HashSet;
import java.util.Scanner;

public class ques18 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashSet<String>basket=new HashSet<>();
		basket.add("Papaya");
		basket.add("papaya");      //duplicate
		basket.add("Pine apple");
		basket.add("Custard apple");
		basket.add("Custard apple"); //duplicate
		basket.add("Blackberries");
		basket.add("Kiwi");
		System.out.println("Enter the specific fruit is exist in the basket");
		String search=sc.nextLine();
	 if(basket.contains(search))
	    {
		 System.out.println("The "+search+" fruit is exist in the basket");
	    }
	 else
	 {
		 System.out.println("The "+search+" fruit is not exist in the basket");
	 }
     }	
	}

