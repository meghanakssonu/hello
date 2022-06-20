package hellonewpackage;

public class Test {
	public static void main(String[] args) {
		String result = convertToUpperCase("Abhi");
		System.out.println(result);
	}

	private static String convertToUpperCase(String string) {
		return string.toUpperCase();
	}

}
