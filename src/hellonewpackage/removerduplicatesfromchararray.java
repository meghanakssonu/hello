package hellonewpackage;

import java.util.Arrays;

public class removerduplicatesfromchararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[]= {'a','b','c','d','a'};
	char k[]=duplicatevalue(array);
	for(int i=0;i<k.length;i++)
	{
		System.out.println(k[i]);
	}
		
	}
	
	static char[]  duplicatevalue(char[] z)
	{
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]==z[j])
				{
					z=delete(z,j);
				}
			}
		
		}
		return z;
	}
	
	static char[] delete(char arr[],int index)
	{
		char[] n=new char[arr.length-1];
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

