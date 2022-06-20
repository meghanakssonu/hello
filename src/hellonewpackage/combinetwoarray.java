package hellonewpackage;

import java.util.Arrays;

public class combinetwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,56};
		int b[]= {3,6,9,5,1};
		int c[]= new int[a.length+b.length];
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[j]=b[i];
			j++;
		}
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
