package week1.day2;

public class FindingIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*
				 * Pseudo Code
				
				 * a) Declare An array for {3,2,11,4,6,7};	 
				 * b) Declare another array for {1,2,8,4,9,7};
				 * c) Declare for loop iterator from 0 to array length
				 * d) Declare a nested for another array from 0 to array length
				 * e) Compare Both the arrays using a condition statement
				 
				 *  f) Print the first array (should match item in both arrays)
				 */
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		System.out.println("Matching Elements of First Array in Second Array:");
		for(int i=0;i<array1.length;i++)
		{
			for(int a=0;a<array2.length;a++)
			{
				if(array1[i]==array2[a])
				{
					System.out.println(array1[i]);
				}
			}
		}
		
		

	}

}
