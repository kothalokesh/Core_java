package methodoverloading;

public class MethodOvrload {
	int add(int a,int b )
	 {
		 return a+b;
	 }
	int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MethodOvrload ob=new MethodOvrload();
		System.out.println(ob.add(1,5));
		System.out.println(ob.add(1, 5,9));

	}

}
