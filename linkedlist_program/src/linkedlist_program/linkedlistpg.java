package linkedlist_program;
import java.util.*;

public class linkedlistpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll =new LinkedList<>(); 
		
		for(int i=0;i<=5;i++)
			ll.add(i);
		
			System.out.println(ll);
			ll.remove(3);
		
	System.out.println(ll);	
			for(int i=0;i<ll.size();i++)
			 
				 System.out.println(ll.get(i)+ "");
		
		}

	}

