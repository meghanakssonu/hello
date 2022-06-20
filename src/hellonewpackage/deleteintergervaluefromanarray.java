package hellonewpackage;

import java.util.Arrays;

public class deleteintergervaluefromanarray {

	public static void main(String[] args) {
		int array[]= {2,3,4,5,0,6,7,8};
		int dparray[] = delete(array, 4);
		System.out.println(Arrays.toString(dparray));
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
