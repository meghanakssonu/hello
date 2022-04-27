package hellonewpackage;

import java.util.Scanner;

public class evenoroddusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no;
       Scanner s=new Scanner(System.in);
       System.out.println("enter a number");
       no=s.nextInt();
       if(no%2==0)
       {
    	   System.out.println("even");  
       }
       else
       {
    	   System.out.println("odd"); 
       }
	}

}
