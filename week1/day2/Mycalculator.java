package week1.day2;

public class Mycalculator {
	
	public static void main(String[] args) {
	
	calculator c = new calculator();
	
		System.out.println("Addition:" + c.add(1, 2, 3));
		System.out.println("Subtraction:" + c.sub(4, 5));
		System.out.println("Multiplication:" + c.mul(1.5, 2.55));
		System.out.println("Division:" + c.divide(20f, 10f));	
	}

}