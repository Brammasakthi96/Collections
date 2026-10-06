//this KEYWORD IN JAVA
package nithi;
public class thiskey 
{
	String name;
	int age;
	void display(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name:"+name);
		System.out.println("Age: "+age);
		
	}
	public static void main(String[] args) 
	{
		thiskey k=new thiskey();
		k.display("aparna", 29);

	}

}
