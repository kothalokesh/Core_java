package lamda_string_pg;
interface statement
{
	public String greet();
}
public class LamdaStringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statement s=()->
		{
			return "hello";
		};
		System.out.println(s.greet());
		

	}

}
