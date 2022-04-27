package hellonewpackage;

class student1{
	int id;
	String name;
	int rollnu;
}

public class objectinitusingvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student1 s1=new student1();
		s1.id=111;
		s1.name="meghana";
		s1.rollnu=10;
		student1 s2=new student1();
		s2.id=222;
		s2.name="darshan";
		s2.rollnu=20;
		System.out.println(s1.id+"  "+s1.name+"  "+s1.rollnu);
		System.out.println(s2.id+"  "+s2.name+"  "+s2.rollnu);


	}

}
