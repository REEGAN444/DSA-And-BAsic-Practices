package DataStructure;

public class BinarySearch {

	static void binarySearch(int arr[],int data)
	{
		int st=0;
		int end=arr.length-1;
		
		while(st<=end)
		{
			int mid=(int)(st+end)/2;
			if(arr[mid]==data)
			{
				System.out.println("Ele Found at arr["+mid+"]");
				return;
			}
			else if(data<arr[mid])
			{
				end=mid-1;
			}
			else if(data>arr[mid]) 
			{
				st=mid+1;
			}
		}
		
		System.out.print("No Founds");
	}
		
		
		public static void main(String args[])
		{
			int arr[]= {1,2,3,4,5,6,7,8,9};
		
			binarySearch(arr,9);
		} 
	
}
