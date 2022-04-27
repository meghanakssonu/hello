package hellonewpackage;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,r,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		no=s.nextInt();
		while(no>0)
		{
			r=no%10;
			rev=rev*10+r;
			no=no/10;
					
		}
		
		System.out.println(rev);

	}

}
