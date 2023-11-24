package Week1Assignments;
import java.util.Scanner;

public class factorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		result=fact(number);
		System.out.println("Factorial of the given number");
		System.out.println(result);
		sc.close();
	}static int fact(int n) {
		int output;
		if(n==1) 
			return 1;
		else
		output=fact(n-1)*n;
		return output;
	}

}
