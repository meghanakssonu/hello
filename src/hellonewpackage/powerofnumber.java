package hellonewpackage;

public class powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int base=4;
      int exponent=2;
      
      long result=1;
      
      while(exponent!=0)
      {
    	  result=result*base;
    	  --exponent;
      }
      
      System.out.print(result);
	}

}
