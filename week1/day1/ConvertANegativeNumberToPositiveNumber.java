package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		
		int num = -1;
		if(num<0) {
			num = num * 2;
			System.out.println("The converted positive number is: "+num);
		}
		else {
			System.out.println("User has given a positive number: "+num);
		}

	}

}
