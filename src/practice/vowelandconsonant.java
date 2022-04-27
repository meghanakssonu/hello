package practice;

public class vowelandconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='Z';
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consosant");
		}

		
		char ch='c';
		
		switch(ch)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'u' :
		case 'o' :
			System.out.println("vowel");
			break;
			default:
				System.out.println("consonant");
				break;
		}
	}

}
