package Treesetpg;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("greeks");
		ts.add("for");
		ts.add("greek");
		ts.add("is");
		ts.add("very helpful");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
