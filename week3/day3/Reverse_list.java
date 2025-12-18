package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_list {

	public static void main(String[] args) {
		String[] name= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> s1= new ArrayList<String>();
		for(String i:name)
		{
			s1.add(i);
		
			
		}
		
		Collections.sort(s1);
		Collections.reverse(s1);
		System.out.println(s1);
		//for(String j:s1)
		//{
		//	s1.add(j);
		//}
	//	System.out.println(s1);
		
		
		
		
		
		
	}

}
