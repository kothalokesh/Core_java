package java_inheritance;
class withdraw
{
	int amt_withdraw=2000;
}

public class atm extends withdraw
{
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm ob1=new atm();
		System.out.println("amount withdraw"+ob1.amt_withdraw);
		System.out.println("amount withdraw"+ob1.amt_left);

	}

}
