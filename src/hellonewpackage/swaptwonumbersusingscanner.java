package hellonewpackage;

import java.util.Scanner;

public class swaptwonumbersusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value in a : ");
		a=s.nextInt();
		System.out.println("enter value in b: ");
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a: " +a);
	System.out.println("b: " +b);

	}

}
