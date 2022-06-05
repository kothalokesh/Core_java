package thispg;

public class Punith {
	int rollno;
	String name;
	float fee;
	Punith(int rollno,String name,Float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
void display()
{
	System.out.println(rollno + " "+name+" "+ fee);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punith t1=new Punith(7,"raj",25000f);
		Punith obj1=new Punith(8,"raj",60000f);
		t1.display();
		obj1.display();
		
	
	}

}
