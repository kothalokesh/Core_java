package collection_java;
import java.util.*;

public class stackpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> obj=new Stack();
		
		obj.push(30);
		obj.push(80);
		obj.push(90);
		System.out.println(obj);
		obj.pop();
		obj.pop();
		System.out.print(obj);
	
 System.out.println(obj.peek());
 
//obj.remove(0);                          //remove location only
 //System.out.println(obj);
 


	}

}
