package hellonewpackage;

import java.util.Arrays;

public class deletearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,3,4,5,6,7};
		array =delete(array,3);
		System.out.println(Arrays.toString(array));

	}
	
	public static int[] delete(int a[],int index)
	{
		int n[]=new int[a.length-1];
		for(int i=0;i<n.length;i++)
		{
			if(i<index)
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
