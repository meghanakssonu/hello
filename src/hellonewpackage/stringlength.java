package hellonewpackage;

public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="meghana";
		String rev="";		
		System.out.println(str.length());

		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
			rev+=str.charAt(i);
		}
		
		System.out.println(rev);

	}

}
