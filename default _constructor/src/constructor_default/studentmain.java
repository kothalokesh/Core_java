package constructor_default;
class student
{
 String name;
 String adress;
 int sales_amount;
 int phone;	

student()
   {
	name="lokesh";
	adress="kadapa";
	sales_amount=0;
	phone=809698698;
	System.out.println("student object is created");
   }
}

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();

	}

}
