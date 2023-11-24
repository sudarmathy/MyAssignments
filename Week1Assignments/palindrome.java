package Week1Assignments;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("Entered String is a palindrome");
		else
			System.out.println("Entered String is not a palindrome");
	}

}
