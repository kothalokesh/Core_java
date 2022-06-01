package Lamda_functionpg;
interface cube
{
	int cal(int a,int b);
	
}

public class Lamdafunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube c=(int a,int b) ->a+b;
		int res=c.cal(5,10);
		System.out.println(res);
		System.out.println(res);

	}

}
