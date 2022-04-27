package hellonewpackage;

public class primebetween20and50 {
	
	public static void main(String[] args) {
		int low=20;
		int high=50;
		int i;

		while(low<high)
		{
	for( i=2;i<low/2;i++)
	{
		if(low%i==0)
		{
			break;
		}
	}
	
		if(low%i==1)
		{
			System.out.println(low);
			low++;
		}
	
	
		}
		
}
	}
