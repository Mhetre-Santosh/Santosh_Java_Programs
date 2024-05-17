package Abstract;  // Assignment 31 = Program to demonstrate ABSTRACT CLASS

abstract class Amazon_Auth
{
	//abstraction 100%
	//hiding 100%
	abstract void un(); // abstract method
	abstract void un_mob(); // abstract method
	void login_button() // Concrete method 1
	{
		System.out.println("Logic");
	}
}

abstract class amazon_login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()   // Concrete method 2
	{
		System.out.println("Logic 1");
	}
}

public class Abstract_class extends amazon_login
{

	static void loginwith_mob()
	{
		System.out.println("Logic 2");
	}
	public static void main(String[] args) 
	{
		loginwith_mob();  //calling child class static method
		
		Abstract_class x= new Abstract_class();
		
		x.un_as_email();		
		x.un_as_mobile();
		x.un();
		x.un_mob();
		
		x.login_button();  // calling Concrete method 1
		x.registration_button(); //calling Concrete method 2
	}
	@Override
	
	void un_as_email() {
		// TODO Auto-generated method stub
		System.out.println("Santosh");
	}
	@Override
	void un_as_mobile() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void un() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void un_mob() {
		// TODO Auto-generated method stub
		
	}

}
