import java.util.*;
class mid
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size");
	int n =sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter array elements");
	
	for(int i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();
	}
	//System.out.println(arr[i]);
	int mid;
	int a=n/2;
	int x=n%2;
	
	if(x==0){
		mid=arr[a-1];
		System.out.print("middle element is  :"+arr[mid]);
	}
	else{
	mid=a;

	System.out.print("middle element is  :"+arr[mid]);
	}
}
}