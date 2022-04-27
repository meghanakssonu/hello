package hellonewpackage;

public class stringprogramcharactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love you meghana";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
            if(s.charAt(i)!= ' ')    
            {
            	count++;
            }
		}
		
		System.out.print(count);
		

	}

}
