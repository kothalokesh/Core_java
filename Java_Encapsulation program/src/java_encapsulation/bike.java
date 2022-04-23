package java_encapsulation;

public class bike     
{
	int year_ofpurchase;
	String make; //data member
	int model;    //data member
	double cost;  //data member
	public void display1()  //member function 
	{
		System.out.println("year of purchse" +2001);
		System.out.println("make"+ "suzuki");
	}
	public void display2()
	{
		System.out.println("model"+1999);
		System.out.println("cost"+20000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new bike();
		obj.display1();
		obj.display2();
		

	}

}
