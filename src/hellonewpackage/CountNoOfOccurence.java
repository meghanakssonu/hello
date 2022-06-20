package hellonewpackage;

public class CountNoOfOccurence 
{
	public static void main(String[] args) 
	{
		int ar[] = {2,1,1,2,3,3,4,1,5,4,8};
		count(ar);
	}
	static void count(int ar[])
	{
		
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					ar=delete(ar,j);
					count++;
				}
			}
			System.out.println(ar[i]+" occured "+count+" times");
		}
	}
	static int[] delete(int a[],int in)
	{
		int n[] = new int[a.length-1];
		for(int i=0;i<n.length;i++)
		{
			if(i<in)
			{
				n[i]=a[i];
			}
			else
			{
				n[i]=a[i+1];
			}
		}
		return n;
	}
}