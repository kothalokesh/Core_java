package hashsetpg;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("this is");
		hs.add("for");
		hs.add("me");
		hs.add("very helpful");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	
		
		

	}

}
