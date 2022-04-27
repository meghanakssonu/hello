package hellonewpackage;

public class smallestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,0,4,5};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);

	}

	}


