package hellonewpackage;

import java.util.Scanner;

public class primenumethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		no=s.nextInt();
		if(no==1)
		{
		System.out.println("prime");
			
		}
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("not prime");
				break;
			}
		}
		if(no==i)
		{
			System.out.println("prime");
	}

}
}