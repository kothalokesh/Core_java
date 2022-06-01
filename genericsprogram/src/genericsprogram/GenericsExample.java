package genericsprogram;
class GenericClass<T>
{
	GenericClass(){
		System.out.println("The generic class is declared now.you can use it well");

		
	}
public void methodgeneric(T obj)
{
	System.out.println("The type of the object that this class now contains is"+obj.getClass().getSimpleName());
}
}
public class GenericsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> test= new GenericClass<>();
		Integer a=5;
		test.methodgeneric(a);
		GenericClass<String> teststring =new GenericClass<>();
		String s="hello";
		teststring.methodgeneric(s);
		

	}

}
