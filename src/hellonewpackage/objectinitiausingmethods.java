package hellonewpackage;

class student{
	
	int id;
	String name;
void insertrecord (int i,String n)
	{
   id=i;
   name=n;
}
void display()
{
System.out.println(id+"  "+name);
}
}

public class objectinitiausingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	student s1=new student();
	student s2=new student();
	s1.insertrecord(1, "meghana");
	s2.insertrecord(2, "darshan");
	s1.display();
	s2.display();

}
}
