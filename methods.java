  //METHOD OVERLOADING (SAME METHOD NAME WITH DIFFERENT PARAMETERS)

package nithi;
public class methods {
	static void add(int a,int b)//same method name with int two parameters
	{
		int sum=a+b;
		System.out.println("Additon of two numbers: "+sum);	  
	}
	static void add(int a,int b,int c)//same method name with int three parameters
	{
		int sum=a+b+c;
		System.out.println("Addition of three numbers: "+sum);
	}
	static void add(double a,double b)//same method name with two double parameters
	{
		double sum=a+b;
		System.out.println("Additionn of two double numbers: "+sum);
	}

	public static void main(String[] args) 
	{
		add(10,20); //two integer values
		add(10,20,1);//three integer values
		add(10.0,20.0);//two double values
	}
	}
		