package Streamcountmethod;
import java.util.ArrayList;
import java.util.List;

public class StreamCountMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> NameList= new ArrayList<>();
		NameList.add("india");
		NameList.add("Russia");
		NameList.add("America");
		NameList.add("England");
		NameList.add("Austrelia");
		
		Long count=NameList.stream().filter(s -> s.length() >5).count();
		System.out.println("total name with more than 5 length is " +count);


	}

}
