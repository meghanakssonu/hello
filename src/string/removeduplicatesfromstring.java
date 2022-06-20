package string;

public class removeduplicatesfromstring {

	public static void main(String[] args) {
		String s="meghana meghana meghana is is a gud girl";
		String[] array = s.split(" ");
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
					if(z[i]!=null && z[j]!=null) {
						
						if(z[i].equalsIgnoreCase(z[j]))
						{
							z[j] = null;
						}
					}
					
				}
			
			}
			return z;
		}
		

	}


