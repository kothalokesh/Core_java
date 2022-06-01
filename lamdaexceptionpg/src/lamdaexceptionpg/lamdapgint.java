package lamdaexceptionpg;
interface cube
{
	int cal(int a);
}

public class lamdapgint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		cube c=(int a)-> a*a*a;
		int res=c.cal(x);
		System.out.println(res);
		
				

	}

}
