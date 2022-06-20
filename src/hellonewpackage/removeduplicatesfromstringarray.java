package hellonewpackage;

public class removeduplicatesfromstringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]= {"meghana","meghana","sonu","darshu","abhi"};
	String k[]=duplicatevalue(array);
	for(int i=0;i<k.length;i++)
	{
		System.out.println(k[i]);
	}
		
	}
	
	static String[]  duplicatevalue(String[] z)
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
	
	static String[] delete(String arr[],int index)
	{
		String[] n=new String[arr.length-1];
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
