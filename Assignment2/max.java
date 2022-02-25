import java.util.*;
class max
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int arr[]=new int[7];
	System.out.println("enter array elements");
	int max=arr[0];
	for(int i=0;i<6;i++)
	{
	arr[i]=sc.nextInt();
	}
	//System.out.println(arr[i]);
	for(int i=1;i<6;i++){
		
	if(arr[i]>max)
	max=arr[i];
	
	}
	System.out.print("maxmum element is  :"+max);
	
}
}
