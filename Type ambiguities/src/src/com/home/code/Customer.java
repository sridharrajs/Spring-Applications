package src.com.home.code;



public class Customer
{

	private String name;
	private String address;
	private int age;
	
	
	public Customer(final String name,final String address,final int age)
	{
		this.name=name;
		this.address=address;
		this.age=age;
	}
	
	public Customer(final int age,final String name,final String address)
	{
		this.age=age;
		this.name=name;
		this.address=address;		
	}
	
	public String toString(){
		return " name : " +name + "\n address : "
               + address + "\n age : " + age;
	}
	
	public final String getName()
	{
		return name;
	}
	public final void setName(String name)
	{
		this.name = name;
	}
	public final String getAddress()
	{
		return address;
	}
	public final void setAddress(String address)
	{
		this.address = address;
	}
	public final int getAge()
	{
		return age;
	}
	public final void setAge(int age)
	{
		this.age = age;
	}
	
	
	

}
