package function;
import java.util.*;

public class cube {
	double vc=0,vcu=0,vs=0;
	void  volume(int s)
	{
	 vc=s*s*s;
	 System.out.println("volume of cube ="+ vc);
	}
	void volume(int l,int b,int h)
	{
		vcu=l*b*h;
		System.out.println("volume of cuboid ="+ vcu);
	}
	
	void volume(float r)
	{
	vs=4/3*3.14*r*r*r;
	System.out.println("volume of sphere ="+ vs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int s,l,b,h;
	float r;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter side of cube");
	s=sc.nextInt();
	
	System.out.println("enter l, b, h of cuboid");
	l=sc.nextInt();
	b=sc.nextInt();
	h=sc.nextInt();
	
	System.out.println("enter the radius of sphere");
	r=sc.nextInt();
	
	cube obj=new cube();
	obj.volume(s);
	obj.volume(l,b,h);
	obj.volume(r);
	
	}
	
	

}
