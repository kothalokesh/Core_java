package Linkedhashset;
import java.util.*;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("geeks");
		lhs.add("for");
		lhs.add("geek");
		lhs.add("is");
		lhs.add("very helpful");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
