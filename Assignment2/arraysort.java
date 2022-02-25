import java.util.*;
class arraysort{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	
System.out.println("enter array elements");
	for(int i=0;i<=5;i++)
	{
	a[i]=sc.nextInt();
	}
	//int even=1;
	//int odd=1;
	//int j;
	
	
	
	for(int i=0;i<a.length;i++)
	{
	//x=i%2;
	if(i%2==0){
	//a[j]=a[i];
	//i++;
	System.out.println("even index elements are  :"+a[i]);
	}
	
	else{
System.out.println("even index elements are  :"+a[i]);
}
}
}}