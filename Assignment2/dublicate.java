import java.util.*;
class dublicate{
	public static void main(String[] args)
	{
//Scanner sc = new Scanner(System.i);
	int arr[] = {4,5,7,2,2,6,6,2,8};
	System.out.println("duplicate elements are");
	boolean b=false;
		for(int i=0;i<arr.length;i++)
	{
	//bolean b=false;
		for(int j = i+1;j<arr.length;j++)
	{
		if (arr[i]== arr[j]){
	b = true;
	//System.out.println(arr[j]);
						}
	}
	}
		if(b){
	System.out.println(arr[j]);
	}
}
}