package hellonewpackage;

public class thirdlargestarray {
	
	public static int getdata(int arr[],int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				              if (arr[i] > arr[j])
				              {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		}
		
		return arr[total-3];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,45,7,9};
		int b[]= {3,5,6,8,9};
		
		System.out.println(getdata(a,a.length));
		System.out.println(getdata(b,5));


	}

}
