package Annotations;

class Annotation 
{
public void display()
{
	System.out.println("base class");
}
}

public class Java_Annotation extends Annotation 
{
	@Override
public void display()
{
	System.out.println("derived class");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Java_Annotation obj=new Java_Annotation();
         obj.display();
      // obj.display(5);
	}

}

