package hellonewpackage;

import java.util.Scanner;
public class primenumberusingscannermethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		no=s.nextInt();
		if(no==1)
		{
			flag=true;
			
		}
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				
				 flag = false;
				break;
			}
			else { flag = true;}
			
		}
		
	if(flag) System.out.println(" prime");
	else  System.out.println(" not prime");

		
		
		}

	}


