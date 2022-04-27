package practice;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even numer");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
