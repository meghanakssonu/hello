package hellonewpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class arrylistusingiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  list=new ArrayList<>();
		list.add("abhi");
		list.add("manu");
		
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			list.add("aunty");
		}
		
	}

}
