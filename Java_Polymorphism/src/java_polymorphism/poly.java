package java_polymorphism;

public class poly {
	void add(int a,int b)
	{
		System.out.println("add 2 nos"+(a+b));
	}
	void add(int x,int y,int z)
	{
		System.out.println("add 3 nos"+(x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly obj=new poly();
		obj.add(3,4);
		obj.add(3,4,5);
		

	}

}
