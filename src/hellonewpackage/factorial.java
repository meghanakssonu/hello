package hellonewpackage;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		no=s.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of " +no+ " " +"is"+" " +fact);

	}

}
