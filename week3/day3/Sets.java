package week3.day3;

import java.util.*;// collections and so on



//import org.apache.commons.collections4.list.TreeList;

public class Sets {

	public static void main(String[] args) {

		
		String name ="sathyazaara ";
		char[] charArray = name.toCharArray();
		System.out.println(charArray.length);
		
		Set<Character> unique=new HashSet<Character>();
		
		
		
		
		//hashset//random order
		//LinkedHashSEt-->insertion order
		// Treeset-->ascii order
		for(Character i: charArray) {
			unique.add(i);
		}
		System.out.println(unique);
		/// 
		
		
		
		
	}

}
