package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				// Sort the array	
				// loop through the array (start i from arr[0] till the length of the array)
					// check if the iterator variable is not equal to the array values respectively
					    // print the number
						// once printed break the iteration
				System.out.println("Sorted Array:" );
				for(int i=0; i<=arr.length-1; i++)
				{
					System.out.println(arr[i]);
				}
				for (int i=arr[0]; i<=arr.length; i++)
				{
					if (i!=arr[i-1])
					{
						System.out.println("The missing element in an array is " + i);
						break;
						}
}
}
}

