package StreamApi;
import java.util.ArrayList;
import java.util.List;


public class StreamApiMinMaxpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> number=new ArrayList<>();
		number.add(14);
		number.add(4);
		number.add(11);
		number.add(78);
		number.add(2);
		number.add(99);
		number.add(7);
		System.out.println(number);
		Integer minNum=number.stream().min((s1,s2) -> s1.compareTo(s2)).get();
		System.out.println("mininum number value list is"+minNum);
		Integer maxNum=number.stream().max((s1,s2) -> s1.compareTo(s2)).get();
		System.out.println("maximum number value list is"+maxNum);
	}

}
