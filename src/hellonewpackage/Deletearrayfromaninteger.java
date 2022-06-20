package hellonewpackage;

import java.util.Arrays;

public class Deletearrayfromaninteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,2,3,4,5,6,7,5};
		System.out.println(Arrays.toString(duplicatevalue(array)));
	}
	
	static int[]  duplicatevalue(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a=delete(a,j);
				}
			}
		
		}
		return a;
	}
	
	static int[] delete(int arr[],int index)
	{
		int n[]=new int[arr.length-1];
				for(int i=0;i<n.length;i++)
				{
					if(i<index)
					{
						n[i]=arr[i];
					}
					else
					{
						n[i]=arr[i+1];
					}
				}
				
				return n;
	}

}
