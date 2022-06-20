package hellonewpackage;

public class Callingvaluefromdifferentmethod {
	
	public static void say()
	{
		System.out.println("hello");
	}
	
	public  void send()
	{
		System.out.println("hi");
	}
	public static void name(String value)
	{
		System.out.println("hi"+value);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Callingvaluefromdifferentmethod.say();
		
		Callingvaluefromdifferentmethod s=new Callingvaluefromdifferentmethod();
		s.send();
		name("abhi");
		

	}

}
