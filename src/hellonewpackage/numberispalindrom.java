package hellonewpackage;

public class numberispalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int actualnum=num;
		int rev=0;
		
		while(num!=0)
		{
		    int n=num%10;
			rev=rev*10+n;
		    num=num/10;
		   
		}
       System.out.println(rev);
	if(actualnum==rev)
	{
		System.out.println("palindrome");
	}
	
	else System.out.println("not palindrome");

}
}
