package week1.day1;

public class Twowheeler {
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=127867356890L;
		boolean isPunctured=false;
		String bikeName="vespa";
		double runningKM=850;
		
		public static void main(String[] args) {
			Twowheeler obj=new Twowheeler(); 
			int a= obj.noOfWheels; 
			  System.out.println(a);
			short b=obj.noOfMirrors;
			  System.out.println(b);
			long c=obj.chassisNumber;
			  System.out.println(c);
			boolean d=obj.isPunctured;
			  System.out.println(d);
			String e=obj.bikeName;
			  System.out.println(e);
			double f=obj.runningKM;	
			  System.out.println(f);					
		}		
		
		
	}


