package string;

public class ReverseTheWordsInASentence {
	public static void main(String[] args) 
	{
		 String s = "Chitradurga is a ford city";
		 System.out.println(s);
	
			char[] c = s.toCharArray();
			s="";
			for(int i=0;i<c.length;i++)
			{
				int k = i;
				while(i<c.length&&c[i]!=' ')
				{
					i++;
					
				}
				int j=i-1;
				while(k<=j)
				{
					s=s+c[j];
					j--;
					
				}
				if(i<c.length)
				{
					s=s+c[i];
				}
			}
			System.out.println(s);
	}
}
