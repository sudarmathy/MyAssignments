package Week1Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int count=0;
		for(int i=2;i<=9;i++) {
		if(x%i==0) {
		count++;	
		}
		}
	    if(count!=0)
	    System.out.println("The given number "+x+"  is  prime");
	    else
		System.out.println("The given number "+x+"  is not prime");
	  }
	}

