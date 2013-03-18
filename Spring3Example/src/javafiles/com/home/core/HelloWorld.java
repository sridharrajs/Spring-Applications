package javafiles.com.home.core;

/*Spring bean*/
public class HelloWorld
{

	private String name;
	
	public void printHello()
	{
		System.out.println("Hello from Spring!!"+" Welcome "+name);		
	}

	public final String getName()
	{
		return name;
	}

	public final void setName(String name)
	{
		this.name = name;
	}
	
	
	
}
