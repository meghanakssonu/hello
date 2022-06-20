package string;

public class ReverseTheWord {

	public static void main(String[] args) {
		String name = "Meghana is good Girl";
		System.out.println(name.length());
		String[] array = name.split(" ");
		String reverse = "";
	
		for(int i=array.length-1;i>=0;i--) {
			reverse = reverse.concat(array[i]+" ");
		}
		
		System.out.println(reverse);
	}

}
