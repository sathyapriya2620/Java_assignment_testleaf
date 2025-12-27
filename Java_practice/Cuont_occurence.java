package practicesession;

public class Cuont_occurence {

	public static void main(String[] args) {

		//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		
		int[] num= {1,2,3,1};
		int count = 0;
		
		for(int i=0;i<num.length;i++)
		{
			 for (int j = i + 1; j < num.length; j++)
			 {
				 if(num[i]==num[j])
				 {
					 System.out.println("yes true");
					count++;
					 System.out.println(count);
					return;
				 }
					 
				 }
			 }
		System.out.println("yes false");	 
	}
	
		

}
