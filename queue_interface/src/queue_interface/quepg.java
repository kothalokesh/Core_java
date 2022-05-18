package queue_interface;
import java.util.*;                                   //package queue

public class quepg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> ob=new PriorityQueue<>();    //Queue object creation
		
		ob.add(50);                                  //insert values
		ob.add(60);
		ob.add(77);
		System.out.println(ob);
		
		ob.remove();
		System.out.println(ob);
		ob.peek();                                 // shown top of elements
	System.out.println(ob);
	ob.remove();                                 //remove only its first
	System.out.println(ob);

	}

}
