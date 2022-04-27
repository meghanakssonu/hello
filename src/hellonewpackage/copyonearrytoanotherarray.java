package hellonewpackage;

public class copyonearrytoanotherarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1= {1,2,3,4,5};
int[] array2= new int[array1.length];
for(int i=0;i<array1.length;i++)
{
	array2[i]=array1[i];
	
	System.out.print(array2[i]);
}

	}

}
